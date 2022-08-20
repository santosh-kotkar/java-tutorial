import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Santosh", "Kotkar", 32),
                new Person("Abhay", "More", 25),
                new Person("Biren", "Mehta", 46),
                new Person("Aarti", "Kotkar", 17),
                new Person("Suraj", "Mhatre", 21),
                new Person("Sagar", "Morya", 25)
        );

        personList.parallelStream().filter(p -> p.getLastName().startsWith("M")).forEach(p -> System.out.println(p.getFirstName()));
    }
}
