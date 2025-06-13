/**
 * StudentResult.java
 * Autor: Adrian Kasprzak
 * Przechowuje wyniki analiz dla jednego studenta: oceny, średnia, min, max.
 */
public class StudentResult implements IStudentResult {
    final int[] grades;
    final double average;
    final int minGrade;
    final int maxGrade;

    public StudentResult(int[] grades, double average, int minGrade, int maxGrade) {
        this.grades = grades;
        this.average = average;
        this.minGrade = minGrade;
        this.maxGrade = maxGrade;
    }

    @Override
    public int[] getGrades() {
        return grades;
    }

    @Override
    public double getAverage() {
        return average;
    }

    @Override
    public int getMinGrade() {
        return minGrade;
    }

    @Override
    public int getMaxGrade() {
        return maxGrade;
    }
}
