import java.util.Arrays;
import java.util.List;

public class CamparatorExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Santosh", "Kotkar", 32),
                new Person("Abhay", "More", 25),
                new Person("Biren", "Mehta", 46),
                new Person("Aarti", "Kotkar", 32)
        );

        /*Sort by Age and First Name*/
        personList.sort((p1, p2) -> {
            if (p1.getAge() == p2.getAge()) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            } else if (p1.getAge() > p2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        });

        personList.forEach(System.out::println);
    }
}

class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
