/**
 * Main.java
 * Autor: [Twoje Imię i Nazwisko]
 * Program testujący działanie AdvancedCalculator na różnych przypadkach.
 */
public class Main {
    public static void main(String[] args) {
        ICalculator calc = new AdvancedCalculator();

        System.out.println("--- Test kalkulatora zaawansowanego ---");

        // Dodawanie
        System.out.println("5 + 3 = " + calc.add(5, 3));

        // Odejmowanie
        System.out.println("10 - 4 = " + calc.subtract(10, 4));

        // Mnożenie
        System.out.println("6 * 7 = " + calc.multiply(6, 7));

        // Dzielenie (poprawne)
        System.out.println("20 / 4 = " + calc.divide(20, 4));

        // Dzielenie przez zero
        System.out.println("8 / 0 = " + calc.divide(8, 0));

        // Potęgowanie (poprawne)
        System.out.println("2 ^ 8 = " + calc.power(2, 8));

        // 0^0
        System.out.println("0 ^ 0 = " + calc.power(0, 0));

        // Potęgowanie liczby ujemnej do niecałkowitej potęgi
        System.out.println("(-4) ^ 0.5 = " + calc.power(-4, 0.5));

        // Pierwiastkowanie (poprawne)
        System.out.println("sqrt(9) = " + calc.sqrt(9));

        // Pierwiastkowanie z liczby ujemnej
        System.out.println("sqrt(-16) = " + calc.sqrt(-16));
    }
}
