import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class RainyDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String dateStr = parts[0];
        String dayOfWeek = parts[1];
        long n = Long.parseLong(parts[2]);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = dateFormat.parse(dateStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int r = 1;

            while (n > 0) {
                calendar.add(Calendar.DAY_OF_MONTH, 1);

                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH) + 1;

                if (isPrime(day) && isMonthPrime(month) && dayOfWeek.equals(getDayOfWeek(calendar))) {
                    System.out.println("Yes " + r);
                    return;
                }

                r++;
                n--;

                if (n == 0) {
                    System.out.println("No 0");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check if the month is prime
    public static boolean isMonthPrime(int month) {
        return month == 2 || month == 3 || month == 5 || month == 7 || month == 11;
    }

    // Function to get the day of the week
    public static String getDayOfWeek(Calendar calendar) {
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        return daysOfWeek[dayOfWeek - 1];
    }
}
