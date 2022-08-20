import java.util.Arrays;
import java.util.List;

public class ForLoopExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                "Mango", "Banana", "Apple", "Papaya", "Pear"
        );

        /*for-loop*/
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        /*for-each*/
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /*lambda for-each*/
        fruits.forEach(fruit -> System.out.println(fruit));

        /*lambda Method reference*/
        fruits.forEach(System.out::println);

    }
}
