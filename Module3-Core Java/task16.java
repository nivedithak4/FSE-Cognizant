import java.util.*;;

public class task16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String noalphanumeric = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = noalphanumeric.length() - 1; i >= 0; i--) {
            reversed += noalphanumeric.charAt(i);
        }
        if (noalphanumeric.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}