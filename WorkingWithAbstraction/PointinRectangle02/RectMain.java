package WorkingWithAbstraction.PointinRectangle02;

import java.util.Arrays;
import java.util.Scanner;

public class RectMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []coordinates = readArray(sc);
        int n = Integer.parseInt(sc.nextLine());

        Point p1 = new Point(coordinates[0],coordinates[1]);
        Point p2 = new Point(coordinates[2],coordinates[3]);

        Rectangle react = new Rectangle(p1,p2);

        while (n-- > 0) {

            int[] arrayXY = readArray(sc);
            Point point = new Point(arrayXY[0],arrayXY[1]);
            System.out.println(react.Contains(point));
        }


    }

    private static int[] readArray(Scanner sc) {
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
