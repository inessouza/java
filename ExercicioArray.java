package exercicioarray;

public class ExercicioArray {
    public static void main(String[] args) {
        int[][] arrayMulti = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < arrayMulti.length; ++i) {
            for (int j = 0; j < arrayMulti[i].length; ++j) {
                System.out.println(arrayMulti[i][j]);
            }
        }
    }
}