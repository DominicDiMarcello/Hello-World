import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        Exercise2();
    }

    private static void Exercise1() {
        System.out.println("Hello");
        System.out.println("Dom");
    }

    private static void Exercise2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        var num1 = scanner.nextLine();

        System.out.println("Enter second number: ");
        var num2 = scanner.nextLine();

        int sum = (Integer.parseInt(num1) + Integer.parseInt(num2));

        System.out.println(sum);
    }

}
