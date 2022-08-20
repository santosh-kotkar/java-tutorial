import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Santosh", "Kotkar", 32),
                new Person("Abhay", "More", 25),
                new Person("Biren", "Mehta", 46),
                new Person("Aarti", "Kotkar", 32)
        );

        //#1
        personList.stream().forEach(System.out::println);

        //#2
        personList.stream().filter(p -> p.getLastName().startsWith("M")).forEach(p -> System.out.println(p.getFirstName()));

        //#3
        long count = personList.stream().filter(p -> p.getLastName().startsWith("M")).count();
        System.out.println(count);


    }
}
