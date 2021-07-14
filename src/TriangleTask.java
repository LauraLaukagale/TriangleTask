import java.util.Scanner;

public class TriangleTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter one side of triangle");

        int sideA = scanner.nextInt();
        System.out.println("Please enter second side of triangle");
        int sideB = scanner.nextInt();

        System.out.println("Please enter third side of triangle");
        int sideC = scanner.nextInt();

        if         ((sideA+sideB<sideC) || (sideB+sideC<sideA) ||(sideA+sideC<sideB)) {
            System.out.println("triangle don't exist");
        }else  if ((sideA == sideB) && (sideB == sideC)) {
            System.out.println("equilateral triangle");
        } else if ((sideA == sideB) || (sideB == sideC) || (sideA == sideC)) {
            System.out.println("isosceles triangle");
        } else if ((sideA != sideB) && (sideB != sideC)) {
            System.out.println("scalene triangle");
        }

    }
}
