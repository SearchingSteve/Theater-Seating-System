import java.util.Scanner;

public class TheaterSeatingSystem {
    private static final int rows = 9;
    private static final int cols = 9;
    private static char[][] seats = new char[rows][cols];
    private static Scanner input = new Scanner(System.in); // Global Scanner

    public static void main(String[] args) {
        initializeSeats();

        while (true) {
            System.out.println("\n--- Movie Theater Booking System ---");
            System.out.println("1. View Seating Chart");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Cancel a Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    displaySeatingChart();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.out.println("Thank you for using the Movie Theater Booking System!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeSeats() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A'; // 'A' for Available
            }
        }
    }

    private static void displaySeatingChart() {
        System.out.println("\nSeating Plan:");
        System.out.print("   ");
        for (int j = 1; j <= cols; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.printf("%c  ", 'A' + i);
            for (int j = 0; j < cols; j++) {
                System.out.printf("%2c ", seats[i][j]);
            }
            System.out.println();
        }
    }

    private static void reserveSeat() {
        System.out.print("\nEnter seat number (e.g., A1): ");
        String seatNumber = input.next().toUpperCase();
        int row = seatNumber.charAt(0) - 'A';
        int col = Integer.parseInt(seatNumber.substring(1)) - 1;

        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            System.out.println("Invalid seat number. Please try again.");
            return;
        }

        if (seats[row][col] == 'R') {
            System.out.println("Seat " + seatNumber + " is already reserved.");
            suggestAvailableSeat();
        } else {
            seats[row][col] = 'R';
            System.out.println("Seat " + seatNumber + " has been successfully reserved.");
        }
    }

    private static void cancelReservation() {
        System.out.print("\nEnter seat number (e.g., A1): ");
        String seatNumber = input.next().toUpperCase();
        int row = seatNumber.charAt(0) - 'A';
        int col = Integer.parseInt(seatNumber.substring(1)) - 1;

        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            System.out.println("Invalid seat number. Please try again.");
            return;
        }

        if (seats[row][col] == 'A') {
            System.out.println("Seat " + seatNumber + " is already available.");
        } else {
            seats[row][col] = 'A';
            System.out.println("Reservation for seat " + seatNumber + " has been canceled.");
        }
    }

    private static void suggestAvailableSeat() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (seats[i][j] == 'A') {
                    String suggestedSeat = (char) ('A' + i) + Integer.toString(j + 1);
                    System.out.println("Suggested available seat: " + suggestedSeat);
                    System.out.print("Would you like to book this seat? (Y/N): ");
                    String response = input.next();
                    if (response.equalsIgnoreCase("Y")) {
                        seats[i][j] = 'R';
                        System.out.println("Seat " + suggestedSeat + " has been successfully reserved.");
                        return;
                    } else {
                        System.out.println("No seat reserved.");
                        return;
                    }
                }
            }
        }
        System.out.println("No seats currently available.");
    }
}
