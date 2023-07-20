package Firstassignmentjava;


    import java.util.Scanner;

    class AboveLimitException extends Exception {
        public AboveLimitException(String message) {
            super(message);
        }
    }

public class CustomException {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter the input value: ");
                int input = scanner.nextInt();
                scanner.close();

                int output = calculateOutput(input);
                System.out.println("Output: " + output);

                if (output > 2 * input) {
                    throw new AboveLimitException("Output is above 2X of the input value.");
                }

                System.out.println("Output is within 2X of the input value.");
            } catch (AboveLimitException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        public static int calculateOutput(int input) {
            int output = input;
            double percentage = 0.5;

            while (output <= 2 * input) {
                output += output * percentage;
                percentage -= 0.05;
            }

            return output;
        }

  //Code Exception error
    // return intrger value. playlist.percentage

}
