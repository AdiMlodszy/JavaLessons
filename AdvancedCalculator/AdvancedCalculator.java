/**
 * AdvancedCalculator.java
 * Autor: Adrian Kasprzak
 * Rozszerzona wersja kalkulatora – zawiera pełną obsługę błędów dla operacji dzielenia i pierwiastkowania.
 */
public class AdvancedCalculator extends BasicCalculator {

    /**
     * Dzieli pierwszą liczbę przez drugą z obsługą dzielenia przez zero.
     * Jeśli dzielnik jest zerem, wypisuje komunikat o błędzie i zwraca Double.NaN.
     *
     * @param a dzielna
     * @param b dzielnik
     * @return iloraz a i b, lub Double.NaN jeśli dzielenie przez zero
     */
    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Błąd: nie można dzielić przez zero!");
            return Double.NaN;
        }
        return super.divide(a, b);
    }

    /**
     * Oblicza pierwiastek kwadratowy z liczby.
     * Jeśli liczba jest ujemna, wypisuje komunikat o błędzie i zwraca Double.NaN.
     *
     * @param a liczba, z której liczymy pierwiastek
     * @return pierwiastek kwadratowy z a lub Double.NaN dla a < 0
     */
    @Override
    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Błąd: nie można obliczyć pierwiastka z liczby ujemnej!");
            return Double.NaN;
        }
        return super.sqrt(a);
    }

    /**
    * Podnosi liczbę do potęgi z walidacją przypadków brzegowych.
    *
    * @param a podstawa
    * @param b wykładnik
    * @return wynik a^b lub Double.NaN w przypadku błędu
    */
    @Override
    public double power(double a, double b) {
            // 1. 0^0 jest nieokreślone
            if (a == 0 && b == 0) {
            System.out.println("Błąd: 0 do potęgi 0 jest nieokreślone!");
            return Double.NaN;
        }
        // 2. Liczba ujemna do niecałkowitej potęgi (np. (-4)^0.5) daje liczbę zespoloną
        if (a < 0 && b != (int) b) {
            System.out.println("Błąd: nieobsługiwane potęgowanie liczby ujemnej do niecałkowitej potęgi!");
            return Double.NaN;
        }
        return super.power(a, b);
    }

    // Pozostałe metody (add, subtract, multiply) dziedziczone bez zmian
}
