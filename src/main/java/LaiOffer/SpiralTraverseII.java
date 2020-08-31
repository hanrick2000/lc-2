package LaiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuehu on 7/2/20.
 * M * N
 */
public class SpiralTraverseII {
    public List<Integer> spiral(int[][] matrix) {
        // Assumptions: matrix is not null, has size of M * N, where M, N >= 0
        List<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
        // need to handle this case since if m == 0, matrix[0].length will
        // throw ArrayIndexOutOf BoundException.

        if (m == 0) {
            return list;
        }

        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;
        // the base case is a little complicated comparing to N * N matrix
        // 1. there is nothing left.
        // 2. there is one rw left
        // 3. there is one column left
        while (left < right && up < down) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }

            for (int i = up + 1; i <= down - 1; i++) {
                list.add(matrix[i][right]);
            }

            for (int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }

            for (int i = down - 1; i >= up + 1; i--) {
                list.add(matrix[i][left]);
            }

            left++;
            right--;
            up++;
            down--;
        }
        // 1. if there is nothing left.
        if (left > right || up > down) {
            return list;
        }

        // 2. if there is one column left.
        if (left == right) {
            for (int i = up; i<= down; i++) {
                list.add(matrix[i][left]);
            }
        } else {
            // 3. if there is one row left.
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {10,11,12,5}, {9,8,7,6}};
        SpiralTraverseII s = new SpiralTraverseII();
        System.out.println(s.spiral(matrix));
    }
}
