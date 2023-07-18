package Firstassignmentjava;

public class Swappingstring {
        public static void swapStrings(String str1, String str2) {
            System.out.println("Before swap:");
            System.out.println("First String: " + str1);
            System.out.println("Second String: " + str2);

            // Concatenate both strings with a delimiter
            str1 = str1 + "##" + str2;

            // Perform substring operations to extract the swapped strings
            str2 = str1.substring(0, str1.indexOf("##"));
            str1 = str1.substring(str1.indexOf("##") + 2);

            System.out.println("After swap:");
            System.out.println("First String: " + str1);
            System.out.println("Second String: " + str2);
        }

        public static void main(String[] args) {
            String firstString = "Hi Java";
            String secondString = "Hello Python";

            swapStrings(firstString, secondString);
        }
    }

