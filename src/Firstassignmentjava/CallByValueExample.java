package Firstassignmentjava;

public class CallByValueExample {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before calling the method: " + number);

        // Calling
        changeValue(number);

        System.out.println("After calling the method: " + number);
    }

    public static void changeValue(int value) {
        value = 20; // Modifying the value
    }

}
