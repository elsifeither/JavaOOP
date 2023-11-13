import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Birthable> birthableList = new ArrayList<>();
        String input = sc.nextLine();

        while (!input.equals("End")) {

            String []tokens = input.split("\\s+");
            String type = tokens[0];

            switch (type) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthDate = tokens[4];

                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    birthableList.add(citizen);
                    break;
                case "Pet":
                    name = tokens[1];
                    birthDate = tokens[2];

                    Pet pet = new Pet(name, birthDate);
                    birthableList.add(pet);
                    break;
            }

            input = sc.nextLine();
        }

        String year = sc.nextLine();
        birthableList.stream()
                .map(Birthable::getBirthDate)
                .filter(birthDate -> birthDate.endsWith(year))
                .forEach(System.out::println);




    }
}