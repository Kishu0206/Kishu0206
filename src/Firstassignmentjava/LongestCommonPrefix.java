package Firstassignmentjava;
    import java.util.Scanner;

    public class LongestCommonPrefix {
        public static String findLongestCommonPrefix(String[] arr) {
            if (arr == null || arr.length == 0) {
                return "No common prefix found";
            }

            String prefix = arr[0];
            int n = arr.length;

            for (int i = 1; i < n; i++) {
                while (!arr[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "No common prefix found";
                    }
                }
            }

            return prefix;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of strings: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            String[] array = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                array[i] = scanner.nextLine();
            }

            scanner.close();

            String commonPrefix = findLongestCommonPrefix(array);
            System.out.println("Longest common prefix: " + commonPrefix);
        }
    }


