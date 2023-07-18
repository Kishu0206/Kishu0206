package Firstassignmentjava;
import java.util.Arrays;
import java.util.Scanner;
public class Mini_Asin_4_SumofArray {
        public static void findPairsWithSum(int[] arr, int targetSum) {
            int n = arr.length;
            int count = 0;

            System.out.println("The pair(s) whose sum is equal to " + targetSum + ":");

            // Sort the array
            Arrays.sort(arr);

            int left = 0;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[left] + arr[right];

                if (currentSum == targetSum) {
                    System.out.println(arr[left] + " " + arr[right]);
                    left++;
                    right--;
                    count++;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }

            if (count == 0) {
                System.out.println("No pairs found.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            int[] array = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int sum = scanner.nextInt();

            scanner.close();

            findPairsWithSum(array, sum);
        }
    }
