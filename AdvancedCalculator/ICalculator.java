/**
 * ICalculator.java
 * Autor: Adrian Kasprzak
 * Interfejs kalkulatora matematycznego.
 * Definiuje podstawowe metody arytmetyczne oraz zaawansowane operacje.
 */
public interface ICalculator {
    /**
     * Dodaje dwie liczby.
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return suma a i b
     */
    double add(double a, double b);

    /**
     * Odejmuje drugą liczbę od pierwszej.
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return różnica a i b
     */
    double subtract(double a, double b);

    /**
     * Mnoży dwie liczby.
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return iloczyn a i b
     */
    double multiply(double a, double b);

    /**
     * Dzieli pierwszą liczbę przez drugą.
     * @param a dzielna
     * @param b dzielnik
     * @return iloraz a i b
     */
    double divide(double a, double b);

    /**
     * Oblicza a podniesione do potęgi b.
     * @param a podstawa
     * @param b wykładnik
     * @return wynik potęgowania a^b
     */
    double power(double a, double b);

    /**
     * Oblicza pierwiastek kwadratowy z liczby.
     * @param a liczba, z której liczymy pierwiastek
     * @return pierwiastek kwadratowy z a
     */
    double sqrt(double a);
}
