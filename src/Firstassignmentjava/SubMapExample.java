package Firstassignmentjava;
import java.util.*;
public class SubMapExample {
        public static void main(String[] args) {
            TreeMap<Integer, String> originalMap = new TreeMap<>();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of key-value pairs: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the key-value pairs:");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter key " + (i + 1) + ": ");
                int key = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter value " + (i + 1) + ": ");
                String value = scanner.nextLine();
                originalMap.put(key, value);
            }

            System.out.print("Enter the start key: ");
            int fromKey = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the end key: ");
            int toKey = scanner.nextInt();
            scanner.close();

            // Get the sub-map using subMap() method
            SortedMap<Integer, String> subMap = originalMap.subMap(fromKey, true, toKey, true);

            System.out.println("Original content: " + originalMap);
            System.out.println("Sub map key-values: " + subMap);
        }
    }

