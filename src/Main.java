import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        // DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        // DISPLAY WELCOME MESSAGE

        System.out.println("******************************");
        System.out.println("**  Welcome to Java Slots  **");
        System.out.println("** Symbols: 🍒 🍉 🍋 🔔 ⭐ **");
        System.out.println("******************************");

        // PLAY IF BALANCE > 0

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.println("Place your bet amount: ");

            // ENTER BET AMOUNT
            bet = scanner.nextInt();

            //      VERIFY IF BET > BALANCE
            if(bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;

            //      VERIFY IF BET > 0
            } else if(bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;

            //      SUBTRACT BET FROM BALANCE
            } else {
                balance -= bet;
            }
        }

        // SPIN ROW

        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE

        scanner.close();
    }
}
