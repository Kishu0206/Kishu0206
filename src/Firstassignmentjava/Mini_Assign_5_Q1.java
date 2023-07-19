package Firstassignmentjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mini_Assign_5_Q1 {
        public static boolean isPalindrome(String str) {
            str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static List<String> getPalindromes(List<String> inputList) {
            List<String> palindromes = new ArrayList<>();

            for (String str : inputList) {
                if (isPalindrome(str)) {
                    palindromes.add(str);
                }
            }

            return palindromes;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements in the list: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            List<String> inputList = new ArrayList<>();
            System.out.println("Enter the elements of the list:");
            for (int i = 0; i < n; i++) {
                inputList.add(scanner.nextLine());
            }

            scanner.close();

            List<String> palindromes = getPalindromes(inputList);
            System.out.println("Palindromes in the list: " + palindromes);
        }
    }

