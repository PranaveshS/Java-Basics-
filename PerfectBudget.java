import java.util.Arrays;
import java.util.Scanner;

public class PerfectBudget {

    public static int findMinimumBudget(int[][] projects) {
        int n = projects.length;
        int minBudget = Integer.MAX_VALUE;

        // Sort projects based on bonus - penalty in descending order
        Arrays.sort(projects, (a, b) -> (b[1] - b[2]) - (a[1] - a[2]));

        // Calculate the minimum budget needed
        for (int i = 0; i < n; i++) {
            int budget = 0;
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    budget += projects[j][0] + projects[j][2]; // Expenditure + penalty
                } else if (j > i) {
                    budget += projects[j][1]; // Bonus
                } else {
                    budget += projects[j][0]; // Expenditure
                }
            }
            minBudget = Math.min(minBudget, budget);
        }

        return minBudget;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int[][] projects = new int[n][3];

        for (int i = 0; i < n; i++) {
            projects[i][0] = scanner.nextInt(); // Expenditure
            projects[i][1] = scanner.nextInt(); // Bonus
            projects[i][2] = scanner.nextInt(); // Penalty
        }

        // Output
        int result = findMinimumBudget(projects);
        System.out.println(result);

        scanner.close();
    }
}

