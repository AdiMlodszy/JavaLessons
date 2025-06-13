import java.util.Arrays;
import java.util.Random;

/**
 * StudentScoresAnalysis.java
 * Autor: [Twoje Imię i Nazwisko]
 * Program tworzy macierz ocen 10x5 (losowe liczby 2-5), analizuje i wypisuje wyniki.
 */
public class StudentsScoresAnalysis {
    public static void main(String[] args) {
        final int STUDENTS = 10;
        final int SUBJECTS = 5;
        Random rand = new Random();

        // Tablica do przechowania wyników dla każdego studenta
        StudentResult[] results = new StudentResult[STUDENTS];

        // Wypełnianie ocen i analiza
        for (int i = 0; i < STUDENTS; i++) {
            int[] grades = new int[SUBJECTS];
            for (int j = 0; j < SUBJECTS; j++) {
                grades[j] = rand.nextInt(4) + 2; // Losuje 2-5
            }
            double avg = ArrayHelpers.average(grades);
            int min = ArrayHelpers.min(grades);
            int max = ArrayHelpers.max(grades);

            results[i] = new StudentResult(grades, avg, min, max);
        }

        // Wyświetlanie tabeli wyników
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "Student", "Oceny", "Średnia", "Min", "Max");
        for (int i = 0; i < STUDENTS; i++) {
            System.out.printf(
                "%-10s %-20s %-10.2f %-10d %-10d\n",
                "Student " + (i+1),
                Arrays.toString(results[i].getGrades()),
                results[i].getAverage(),
                results[i].getMinGrade(),
                results[i].getMaxGrade()
            );
        }
    }
}
