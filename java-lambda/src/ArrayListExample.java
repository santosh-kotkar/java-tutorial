import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                "Mango", "Banana", "Apple", "Papaya", "Pear"
        );

        Inventory inventory = fruits::contains;
        System.out.println(inventory.isAvailable("Papaya"));
        System.out.println(inventory.isAvailable("Strawberry"));
    }
}

interface Inventory {
    boolean isAvailable(String fruit);
}
