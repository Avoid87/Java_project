package Lesson1;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; //Двумерный массив
        System.out.println(matrix[2][0]); //обращаемся снаала к строке, затем к столбцу

        String[][] strings = new String[3][3];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int x:matrix[0]
             ) {
            System.out.println(x);
        }
    }
}
