package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SetMatrixZero {
    static public void setZeroes(int[][] matrix) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    arrayList.add(i);
                    arrayList.add(j);

                }

            }
        }


        int maxLength = Math.max((matrix.length), (matrix[0].length));


        for (int i = 0; i < arrayList.size(); i += 2) {
            int row = arrayList.get(i);
            int column = arrayList.get(i + 1);
            for (int j = 0; j < maxLength; j++) {

                if (matrix.length > j) {
                    matrix[j][column] = 0;

                }
                if (matrix[0].length > j) {
                    matrix[row][j] = 0;
                }

            }
        }


    }

    public static void main(String[] args) {
        int[][] array = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(array);
    }

}
