package Firstassignmentjava;


// Test interface
interface Test {
    int square(int number);
}

// Arithmetic class implementing the Test interface
class Arithmetic implements Test {
    @Override
    public int square(int number) {
        return number * number;
    }
}

// ToTestInt class using the object of Arithmetic class
class ToTestInt {
    private Arithmetic arithmetic;

    public ToTestInt() {
        arithmetic = new Arithmetic();
    }

    public void performSquare(int number) {
        int result = arithmetic.square(number);
        System.out.println("Square of " + number + " is: " + result);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        ToTestInt toTestInt = new ToTestInt();
        toTestInt.performSquare(11);
    }
}
