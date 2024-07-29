import java.util.ArrayList;
import java.util.Scanner;

public class ScoreOfCells {

    public static void findCellsWithScore(int[][] table, int n, int m, int k) {
        ArrayList<String> result = new ArrayList<>();

        // Iterate through each cell in the table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int currentScore = countUniqueWays(table, n, m, i, j);
                if (currentScore == k) {
                    result.add(i + " " + j);
                }
            }
        }

        // Print the result
        if (result.isEmpty()) {
            System.out.println("NO");
        } else {
            for (String cell : result) {
                System.out.println(cell);
            }
        }
    }

    public static int countUniqueWays(int[][] table, int n, int m, int row, int col) {
        if (row < 0 || row >= n || col < 0 || col >= m) {
            return 0;
        }

        int currentValue = table[row][col];
        int ways = 1;

        // Check and count unique ways to move down
        if (row + 1 < n && table[row + 1][col] >= currentValue) {
            ways += countUniqueWays(table, n, m, row + 1, col);
        }

        // Check and count unique ways to move right
        if (col + 1 < m && table[row][col + 1] >= currentValue) {
            ways += countUniqueWays(table, n, m, row, col + 1);
        }

        return ways;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] table = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        // Output
        findCellsWithScore(table, n, m, k);

        scanner.close();
    }
}
