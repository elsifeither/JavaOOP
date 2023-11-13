import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Buyer> buyerMap = new HashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String []data = sc.nextLine().split("\\s+");
            String name = data[0];
            if (data.length == 4) {
                int age = Integer.parseInt(data[1]);
                String id = data[2];
                String birthDate = data[3];
                Citizen citizen = new Citizen(name, age, id, birthDate);
                buyerMap.put(name, citizen);
            } else {
                int age = Integer.parseInt(data[1]);
                String group = data[2];
                Rebel rebel = new Rebel(name, age, group);
                buyerMap.put(name, rebel);
            }
        }


        String input = sc.nextLine();
        while (!input.equals("End")) {
            String name = input;
            Buyer buyer = buyerMap.get(name);
            if (buyer != null) {
                buyer.buyFood();
            }
            input = sc.nextLine();
        }

        int boughtFood = buyerMap.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();
        System.out.println(boughtFood);


    }
}