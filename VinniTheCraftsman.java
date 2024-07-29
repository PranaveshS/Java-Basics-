import java.util.Scanner;

public class VinniTheCraftsman {

    public static int getMaxAmount(int N, int M, int[] quantityAvailable, int[] quantityNeeded,
            int[] costOfOneUnit, int[] sellingPrice) {
        int maxAmount = 0;

        for (int i = 0; i < M; i++) {
            int quantitySelected = Math.min(quantityAvailable[i] / quantityNeeded[i], N / costOfOneUnit[i]);
            N -= quantitySelected * costOfOneUnit[i];
            maxAmount += quantitySelected * sellingPrice[i];
        }

        return maxAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] quantityAvailable = new int[M];
        int[] quantityNeeded = new int[M];
        int[] costOfOneUnit = new int[M];
        int[] sellingPrice = new int[M];

        for (int i = 0; i < M; i++) {
            quantityAvailable[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            quantityNeeded[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            costOfOneUnit[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            sellingPrice[i] = scanner.nextInt();
        }

        // Output
        int result = getMaxAmount(N, M, quantityAvailable, quantityNeeded, costOfOneUnit, sellingPrice);
        System.out.println(result);

        scanner.close();
    }
}

