import java.util.*;
public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Choose an operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double res;
        switch (op) {
            case '+':
                res = num1 + num2;
                System.out.println("Result = " + res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println("Result = " + res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println("Result = " + res);
                break;
            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.println("Result = " + res);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}