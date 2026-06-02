import java.util.ArrayList;
import java.util.Scanner;
public class task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students.add(sc.nextLine());
        }
        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}