import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for 5 numbers
        System.out.print("Enter 5 numbers:");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        // Sorting the numbers
        Collections.sort(numbers);

        // Printing the sorted numbers
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}

