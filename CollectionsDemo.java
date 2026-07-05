import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(23);
        numbers.add(67);

        System.out.println("Original List: " + numbers);
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
        System.out.println("Minimum Element: " + Collections.min(numbers));
        System.out.println("Maximum Element: " + Collections.max(numbers));
    }
}