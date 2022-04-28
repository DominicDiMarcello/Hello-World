import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        Exercise3();
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

    private static void Exercise3() {
        var A = -5 + 8 * 6;
        var B = (55+9) % 9;
        var C = 20 + -3 * 5 / 8;
        var D = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }

}
