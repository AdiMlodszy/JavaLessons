/**
 * MatrixHelpers.java
 * Autor: Adrian Kasprzak
 * Klasa pomocnicza do operacji na macierzach: drukowanie oraz sprawdzanie zer.
 */
public class MatrixHelpers {
    // Sprawdza, czy wiersz zawiera zero
    public boolean containsZero(int[] row) {
        for (int value : row) {
            if (value == 0) return true;
        }
        return false;
    }

    // Drukuje macierz w konsoli
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}