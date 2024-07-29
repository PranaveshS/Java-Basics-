import java.util.Scanner;

public class Orchard {

    public static int countPossibilities(String row) {
        int count = 0;
        for (int i = 0; i < row.length() - 2; i++) {
            if (row.charAt(i) != row.charAt(i + 1) && row.charAt(i + 1) != row.charAt(i + 2)
                    && row.charAt(i) != row.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }

    public static String findWinner(String ashokRow, String anandRow) {
        int ashokPossibilities = countPossibilities(ashokRow);
        int anandPossibilities = countPossibilities(anandRow);

        if (ashokPossibilities > anandPossibilities) {
            return "Ashok";
        } else if (anandPossibilities > ashokPossibilities) {
            return "Anand";
        } else {
            return "Draw";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String ashokRow = scanner.nextLine().trim();
        String anandRow = scanner.nextLine().trim();

        // Check for invalid input
        if (!ashokRow.matches("[ML]+") || !anandRow.matches("[ML]+")) {
            System.out.println("Invalid input");
        } else {
            // Output
            String winner = findWinner(ashokRow, anandRow);
            System.out.println(winner);
        }

        scanner.close();
    }
}
