package Firstassignmentjava;
import java.util.Scanner;
public class StringSort {
        public static void selectionSort(String[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j].compareTo(arr[minIndex]) < 0) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    swap(arr, i, minIndex);
                }
            }
        }

        public static void swap(String[] arr, int i, int j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
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

            System.out.println("Before sorting:");
            displayArray(array);

            selectionSort(array);

            System.out.println("After sorting:");
            displayArray(array);
        }

        public static void displayArray(String[] arr) {
            for (String str : arr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

