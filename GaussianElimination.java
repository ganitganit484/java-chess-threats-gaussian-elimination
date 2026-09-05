package assignment1;

/**
 * The function accepts an array of arrays representing a matrix and performs a ranking using the Gaussian elimination method.
 */
public class GaussianElimination {
    public static void gaussianElimination(double[][] matrix) {
        int row = 1;
        int col = 1;
        int col_num = matrix[0].length;
        int row_num = matrix.length;
        if (row_num == 0 || col_num == 0 || matrix == null) {
            return;
        }
        while (row <= row_num && col <= col_num){//As long as we don't go outside the boundaries of the array (matrix), we will continue to run in the loop.
            double max_num = Math.abs(matrix[row-1][col-1]);//We will initialize the maximum to be the first element in the first array.
            int max_row_index = row-1; //To move the array to the correct position, we will store the index of the array with the maximum element.
            for (int cur_row = row; cur_row<row_num ; cur_row++) { //We will go through all the numbers starting from one row below the number we started with and ending at the end of the column. If the number is greater than the number we started with, we will define it as the maximum number and replace the row index with the maximum number for its row.
                if (Math.abs(matrix[cur_row][col - 1]) > max_num) {
                    max_num = Math.abs(matrix[cur_row][col - 1]);
                    max_row_index = cur_row;
                }
            }
            if (max_num == 0) {//If after we have finished going through the entire column the largest number is 0 we move on to the next column without changing lines.
                col++;
                continue;
            }
            if (max_row_index != row-1){ //We will check whether the index of the row containing the largest number in the column is different from the index where we started the test. If so, we will swap the rows so that the row containing the highest number replaces the row where we started the test.
                double[] row_to_move = matrix[row-1];
                matrix[row-1] = matrix[max_row_index];
                matrix[max_row_index] = row_to_move;
            }
            for (int row_to_reset = row; row_to_reset<row_num; row_to_reset++) {//We will go through all the rows after the row containing the highest number in the column (after moving it to its correct position), we will change the numbers in the column to 0, and for each row below we will perform the operation according to Gaussian elimination.
                double f = matrix[row_to_reset][col-1]/max_num;
                matrix[row_to_reset][col-1] = 0;
                for (int rest_col = col; rest_col<col_num; rest_col++){
                    matrix[row_to_reset][rest_col] -= f * matrix[row-1][rest_col];
                }
            }
            row++;//Finally, we increase the column and row by 1 and thus proceed to perform the ranking on the rest of the matrix.
            col++;
        }
    }
}
