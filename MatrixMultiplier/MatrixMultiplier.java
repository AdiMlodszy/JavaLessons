import java.util.Random;
/**
 * MatrixMultiplier.java
 * Autor: Adrian Kasprzak
 * Program tworzy dwie macierze 5x5 z liczbami losowymi (0-10),
 * mnoży je zgodnie z zasadami algebry liniowej,
 * a wiersze z zerem w pierwszej macierzy pomija w mnożeniu.
 */

 public class MatrixMultiplier extends MatrixHelpers {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[][] matrixA = new int[SIZE][SIZE];
        int[][] matrixB = new int[SIZE][SIZE];
        int[][] result = new int[SIZE][SIZE];
        Random rand = new Random();

        // Utwórz instancję klasy, bo metody nie są statyczne
        MatrixMultiplier mm = new MatrixMultiplier();

        // Wypełnianie macierzy losowymi liczbami 0-10
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrixA[i][j] = rand.nextInt(11);
                matrixB[i][j] = rand.nextInt(11);
            }
        }

        System.out.println("Macierz A:");
        mm.printMatrix(matrixA);
        System.out.println("Macierz B:");
        mm.printMatrix(matrixB);

        // Mnożenie macierzy z pominięciem wierszy z zerem w matrixA
        for (int i = 0; i < SIZE; i++) {
            if (mm.containsZero(matrixA[i])) {
                System.out.println("Wiersz " + i + " w macierzy A zawiera zero, pomijam w mnożeniu.");
                continue;
            }
            for (int j = 0; j < SIZE; j++) {
                int sum = 0;
                for (int k = 0; k < SIZE; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
            }
        }

        System.out.println("Wynik mnożenia (wiersze z zerem w A są pominięte):");
        mm.printMatrix(result);
    }
}