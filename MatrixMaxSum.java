public class MatrixMaxSum {

    public static void main(String[] args) {

        int[][] matrix =
                {{0, 1, 3, 1, 5},
                        {3, 0, 2, 0, 2},
                        {3, 1, 3, 2, 0},
                        {2, 4, 2, -1, 0},
                        {5, 0, 3, 9, 9}};

        System.out.println(maxSum(matrix, 2));
    }

    public static int maxSum(int[][] matrix, int windowSize) {

        int length = matrix.length;
        int maxSum = Integer.MIN_VALUE;

        for (int k = 0; k <= length - windowSize; k++) {
            for (int m = 0; m <= length - windowSize; m++) {
                int sum = 0;

                for (int i = k; i < k + windowSize; i++) {
                    for (int j = m; j < m + windowSize; j++) {
                        sum += matrix[i][j];
                    }
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
