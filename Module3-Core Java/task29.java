import java.util.*;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ella", 20);
        Person p2 = new Person("Ray", 17);
        Person p3 = new Person("Anna", 22);
        List<Person> people = Arrays.asList(p1, p2, p3);

        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("People aged 18 and above:");
        adults.forEach(System.out::println);
    }
}