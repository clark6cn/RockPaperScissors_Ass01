import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;
        do {
            do {
                System.out.print("Player A, enter R, P, or S: ");
                playerA = in.nextLine();
                if (!playerA.equalsIgnoreCase("R") &&
                        !playerA.equalsIgnoreCase("P") &&
                        !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            } while (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S"));
            do {
                System.out.print("Player B, enter R, P, or S: ");
                playerB = in.nextLine();
                if (!playerB.equalsIgnoreCase("R") &&
                        !playerB.equalsIgnoreCase("P") &&
                        !playerB.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            } while (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S"));
            if (playerA.equalsIgnoreCase(playerB)) {
                if (playerA.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, it's a Tie!");
                } else if (playerA.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, it's a Tie!");
                } else {
                    System.out.println("Scissors vs Scissors, it's a Tie!");
                }
            } else if (
                    (playerA.equalsIgnoreCase("R") &&
                            playerB.equalsIgnoreCase("S")) ||
                            (playerA.equalsIgnoreCase("P") &&
                                    playerB.equalsIgnoreCase("R")) ||
                            (playerA.equalsIgnoreCase("S") &&
                                    playerB.equalsIgnoreCase("P"))) {

                if (playerA.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors!");
                } else if (playerA.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock!");
                } else {
                    System.out.println("Scissors cuts Paper!");
                }
                System.out.println("Player A wins!");
            } else {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock!");
                } else {
                    System.out.println("Scissors cuts Paper!");
                }
                System.out.println("Player B wins!");
            }
            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = in.nextLine();
                if (!playAgain.equalsIgnoreCase("Y") &&
                        !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Invalid choice. Enter Y or N.");
                }
            } while (!playAgain.equalsIgnoreCase("Y") &&
                    !playAgain.equalsIgnoreCase("N"));
            System.out.println();
        } while (playAgain.equalsIgnoreCase("Y"));
        System.out.println("Thanks for playing!");
        in.close();
    }
}
