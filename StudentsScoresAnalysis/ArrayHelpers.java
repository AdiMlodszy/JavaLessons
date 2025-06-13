/**
 * ArrayHelpers.java
 * Autor: Adrian Kasprzak
 * Klasa narzędziowa do analizy tablic ocen.
 */
public class ArrayHelpers {
    /**
     * Oblicza średnią z ocen.
     * @param grades tablica ocen (int[])
     * @return średnia ocen (double)
     */
    public static double average(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    /**
     * Znajduje minimalną ocenę w tablicy.
     * @param grades tablica ocen (int[])
     * @return najmniejsza ocena (int)
     */
    public static int min(int[] grades) {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) min = grade;
        }
        return min;
    }

    /**
     * Znajduje maksymalną ocenę w tablicy.
     * @param grades tablica ocen (int[])
     * @return największa ocena (int)
     */
    public static int max(int[] grades) {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) max = grade;
        }
        return max;
    }
}
