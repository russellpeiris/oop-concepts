package Polymorphism.Overloading;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 and 3: " + calc.add(2, 3)); // Output: 5

        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3)); // Output: 6

        System.out.println("Sum of 1.1 and 2.2: " + calc.add(1.1, 2.2)); // Output: 3.3
    }
}
