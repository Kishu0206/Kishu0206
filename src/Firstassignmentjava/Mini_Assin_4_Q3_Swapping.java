package Firstassignmentjava;
import java.util.Scanner;
public class Mini_Assin_4_Q3_Swapping {
        public static String swapFirstLastCharacters(String str) {
            if (str == null || str.length() <= 1) {
                return str;
            }

            char[] charArray = str.toCharArray();
            char firstChar = charArray[0];
            char lastChar = charArray[str.length() - 1];

            charArray[0] = lastChar;
            charArray[str.length() - 1] = firstChar;

            return new String(charArray);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            scanner.close();

            String result = swapFirstLastCharacters(input);
            System.out.println("Swapped string: " + result);
        }
    }

