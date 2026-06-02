import java.util.*;
public class task27 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Ben");
        names.add("Catherine");
        names.add("Elsa");
        names.add("Ella");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted List:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}