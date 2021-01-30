import javax.swing.JOptionPane;

public class exerciseProject {
    public static void main(String[] args) {
        // Math.random() generate numbers from 0 to 1 (excluding)
        int compNumber = (int) (Math.random() * 100 + 1); // 0.6789 * 100 = 67.89 = 67
        System.out.print("The correct output is " + compNumber);
        int userNumber = 0;
        int count = 1;
        int limit = 10;

        while (userNumber != compNumber) {
            String respone = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userNumber = Integer.parseInt(respone);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userNumber, compNumber, count));
            count++;
            if (count > limit) {
                System.out.println("limit exeeded, You Losse");
                return;
            }
        }
    }
    public static String determineGuess(int userNumber, int compNumber, int count) {
        if (userNumber <= 0 || userNumber > 100) {
            return "Your guess is Invalid";
        } else if (userNumber == compNumber) {
            return "Correct! \n Total guesses: " + count;
        } else if (userNumber < compNumber) {
            return "Your guess is too low, try again: " + count;
        } else if (userNumber > compNumber) {
            return "Your guess is too high, try again" + count;
        } else {
            return "Your guess is incorrect, try again" + count;
        }
    }
}
