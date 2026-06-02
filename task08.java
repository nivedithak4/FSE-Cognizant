import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int result1 = a + b * c;
        int result2 = (a + b) * c;
        System.out.println("\nExpression 1: " + a + " + " + b + " * " + c + " = " + result1);
        System.out.println("Expression 2: (" + a + " + " + b + ") * " + c + " = " + result2);
        System.out.println("\nOrder of Operations:");
        System.out.println("1. Parentheses ()");
        System.out.println("2. Multiplication (*) and Division (/)");
        System.out.println("3. Addition (+) and Subtraction (-)");
    }
}