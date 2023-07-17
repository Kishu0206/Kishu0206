package Firstassignmentjava;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public double getFractionalValue() {
        return (double) numerator / denominator;
    }
}

class FractionDemo {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(6, 7);
        Fraction fraction2 = new Fraction(5);
        Fraction fraction3 = new Fraction();

        System.out.println("Fraction 1: " + fraction1.getFractionalValue());
        System.out.println("Fraction 2: " + fraction2.getFractionalValue());
        System.out.println("Fraction 3: " + fraction3.getFractionalValue());
    }
}

