/**
 * BasicCalculator.java
 * Autor: Adrian Kasprzak
 * Klasa bazowa implementująca podstawowe operacje kalkulatora.
 * Brak zaawansowanej obsługi wyjątków – tylko czyste obliczenia.
 */
public class BasicCalculator implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        // UWAGA: Brak obsługi dzielenia przez zero!
        return a / b;
    }

    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double sqrt(double a) {
        // UWAGA: Brak obsługi pierwiastkowania z liczby ujemnej!
        return Math.sqrt(a);
    }
}
