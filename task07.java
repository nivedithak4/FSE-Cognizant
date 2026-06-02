import java.util.Scanner;
public class task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        int intValue = (int) d;
        System.out.print("Enter an integer value: ");
        int i = sc.nextInt();
        double doubleValue = (double) i;
        System.out.println("Double value: " + d);
        System.out.println("After casting to int: " + intValue);
        System.out.println("Integer value: " + i);
        System.out.println("After casting to double: " + doubleValue);
    }
}
