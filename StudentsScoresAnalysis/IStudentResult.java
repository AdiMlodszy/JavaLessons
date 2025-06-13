/**
 * IStudentResult.java
 * Autor: Adrian Kasprzak
 * Interfejs opisujący wynik analizy ocen studenta.
 */
public interface IStudentResult {
    int[] getGrades();
    double getAverage();
    int getMinGrade();
    int getMaxGrade();
}
