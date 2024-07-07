//Create a list of integers. Convert each element to its square.
import java.util.ArrayList;
import java.util.List;

public class CollectionTask7 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Convert each element to its square
        for (int i = 0; i < numbers.size(); i++) {
            int square = numbers.get(i) * numbers.get(i);
            numbers.set(i, square);
        }

        // Print the updated list
        System.out.println("List of squares:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
