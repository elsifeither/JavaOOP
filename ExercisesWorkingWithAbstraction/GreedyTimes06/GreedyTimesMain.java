
package ExercisesWorkingWithAbstraction.GreedyTimes06;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GreedyTimesMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> collector = new LinkedHashMap<>();
        long gold = 0;
        long stones = 0;
        long money = 0;

        for (int i = 0; i < items.length; i += 2) {
            String name = items[i];
            long count = Long.parseLong(items[i + 1]);

            String item = "";

            if (name.length() == 3) {
                item = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                item = "Gem";
            } else if (name.equalsIgnoreCase("gold")) {
                item = "Gold";
            }

            if (item.equals("")) {
                continue;
            } else if (input < collector.values()
                    .stream().map(Map::values)
                    .flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (item) {
                case "Gem":
                    if (!collector.containsKey(item)) {
                        if (collector.containsKey("Gold")) {
                            if (count > collector.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (collector.get(item).values().stream().mapToLong(e -> e).sum() + count > collector.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!collector.containsKey(item)) {
                        if (collector.containsKey("Gem")) {
                            if (count > collector.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (collector.get(item).values().stream().mapToLong(e -> e).sum() + count > collector.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!collector.containsKey(item)) {
                collector.put((item), new LinkedHashMap<String, Long>());
            }

            if (!collector.get(item).containsKey(name)) {
                collector.get(item).put(name, 0L);
            }


            collector.get(item).put(name, collector.get(item).get(name) + count);
            if (item.equals("Gold")) {
                gold += count;
            } else if (item.equals("Gem")) {
                stones += count;
            } else if (item.equals("Cash")) {
                money += count;
            }
        }

        for (var itemQuantity : collector.entrySet()) {
            Long sumValues = itemQuantity.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", itemQuantity.getKey(), sumValues));

            itemQuantity.getValue().entrySet()
                    .stream()
                    .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}