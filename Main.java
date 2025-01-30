import java.util.Random;
import java.util.Scanner;

/**
 * The program is a game where the player will roll 3 dice to get a total sum of 12 in order to win.
 *
 * 1. Program Description:
 *    This program simulates a dice game where the player rolls three dice to achieve a target sum of 12.
 *    - Each dice can be rolled only once per round.
 *    - If the sum equals 12 after three rolls, the player wins.
 *    - If the sum exceeds 12, the player loses.
 *    - The game continues until the player chooses to quit by entering 'q'.
 *
 * 2. Features Implemented:
 *    - Input validation to ensure correct user input.
 *    - Random dice roll generation using the Random class.
 *    - Tracking of wins and losses.
 *    - Resetting the game state after each round.
 *
 * 3. Logic Overview (Pseudocode):
 *    - Display a welcome message.
 *    - Use a while loop to keep the game running until the user quits.
 *    - Within the loop:
 *        - Ask the user to roll a dice (1, 2, or 3) or quit the game.
 *        - Validate the input.
 *        - If valid, generate a random value for the chosen dice.
 *        - Track the total sum and ensure the same dice is not rolled twice.
 *        - After three rolls, check the total sum:
 *            - If the sum is 12, increment the win counter.
 *            - If the sum exceeds 12, increment the loss counter.
 *            - Otherwise, continue to the next round.
 *    - Display the final game statistics (wins and losses) when the user exits.
 *
 *
 * @author Stella Zhang
 */
class Main {
  /**
   * Below static strings are there to help you get the messages correct.
   * Autograder checks for these exact strings, so it is mentioned here.
   * You can rename them if you want, and you can directly use them in your code.
   * Just make sure these exact messages are used.
   */
    static final String GAME_START = "Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...\n";
    static final String CHOOSE_DICE = "Enter which dice you want to roll [1,2,3] (exit with q):";
    static final String ROUND_WON = "You won!!";
    static final String ROUND_LOST = "You lost!!";
    static final String ROUND_TIE = "You neither won nor lost the round.";
    static final String NEXT_ROUND = "Next round!";
    static final String GAME_OVER = "Game Over!";
    static final String ALREADY_SELECTED_DICE = "Sorry, you have already rolled that dice. Try again";
    static final String INVALID_ENTRY = "Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q\n";
    static final String AMOUNT_WIN_STRING = "#win: ";
    static final String AMOUNT_LOST_STRING = " #loss: ";
    static final String SUM_STRING = " sum: ";
    static final int MAX_DICE_VALUE = 6;
    static final int MIN_DICE_VALUE = 1;
    static final int DICE_SUM_TARGET_VALUE = 12;

    public static void main(final String[] args) {

        int dice1Value = 0; // The value of the first dice
        boolean isDice1Rolled = false; // Whether the first dice is rolled or not

        int dice2Value = 0; // The value of the second dice
        boolean isDice2Rolled = false; // Whether the second dice is rolled or not

        int dice3Value = 0; // The value of the third dice
        boolean isDice3Rolled = false; // Whether the third dice is rolled or not

        int sum = 0; // The sum of the dice values
        int winCounter = 0; // The number of wins
        int lossCounter = 0; // The number of losses

        boolean isPlaying = true; // Whether the game is being played or not

        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();

        System.out.println(GAME_START);

        while (isPlaying) {
            System.out.println(CHOOSE_DICE);
            String input = userInput.next();

            if (input.equalsIgnoreCase("q")) {
                System.out.println(AMOUNT_WIN_STRING + winCounter + AMOUNT_LOST_STRING + lossCounter);
                System.out.println(GAME_OVER);
                break;
            }

            // Validate user input to ensure it is a valid option (1, 2, 3, or 'q')

            if (!input.matches("[1-3]")) {
                System.out.println(INVALID_ENTRY);
                continue;
            }

            int choice = Integer.parseInt(input);

            // Roll the chosen dice and update the sum
            if (choice == 1 && !isDice1Rolled) {
                dice1Value = rand.nextInt(MAX_DICE_VALUE) + MIN_DICE_VALUE;
                sum += dice1Value;
                isDice1Rolled = true;
            } else if (choice == 2 && !isDice2Rolled) {
                dice2Value = rand.nextInt(MAX_DICE_VALUE) + MIN_DICE_VALUE;
                sum += dice2Value;
                isDice2Rolled = true;
            } else if (choice == 3 && !isDice3Rolled) {
                dice3Value = rand.nextInt(MAX_DICE_VALUE) + MIN_DICE_VALUE;
                sum += dice3Value;
                isDice3Rolled = true;
            } else {
                System.out.println(ALREADY_SELECTED_DICE);
                continue;
            }

            System.out.println(dice1Value + " " + dice2Value + " " + dice3Value + SUM_STRING + sum
                    + " " + AMOUNT_WIN_STRING + winCounter + AMOUNT_LOST_STRING + lossCounter);

            if (isDice1Rolled && isDice2Rolled && isDice3Rolled) {
                if (sum == DICE_SUM_TARGET_VALUE) {
                    System.out.println(ROUND_WON);
                    winCounter++;
                } else if (sum > DICE_SUM_TARGET_VALUE) {
                    System.out.println(ROUND_LOST);
                    lossCounter++;
                } else {
                    System.out.println(ROUND_TIE);
                }

                System.out.println(NEXT_ROUND);
                isDice1Rolled = false;
                isDice2Rolled = false;
                isDice3Rolled = false;

                dice1Value = 0;
                dice2Value = 0;
                dice3Value = 0;
                sum = 0;
            }
        }
        userInput.close();
    }
}