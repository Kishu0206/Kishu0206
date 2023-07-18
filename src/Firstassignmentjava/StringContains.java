package Firstassignmentjava;

public class StringContains {
    public static boolean contains(String str, String substring) {
        if (str == null || substring == null) {
            return false;
        }

        int strLength = str.length();
        int subLength = substring.length();

        for (int i = 0; i <= strLength - subLength; i++) {
            int j;

            // Check
            for (j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
            }

            if (j == subLength) {
                return true;
            }
        }

        // Substring not found in the string
        return false;
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String substring1 = "World";
        String substring2 = "Java";

        boolean result1 = contains(str, substring1);
        boolean result2 = contains(str, substring2);

        System.out.println("Contains 'World': " + result1);
        System.out.println("Contains 'Java': " + result2);
    }
}
