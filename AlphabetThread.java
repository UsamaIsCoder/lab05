package task01;
import java.util.Random;

public class AlphabetThread extends Thread {
    private char letter;

    public AlphabetThread(char letter) {
        this.letter = letter;
    }

    @Override
    public void run() {
        try {
            // Generate a random delay between 100 to 500 milliseconds
            Random random = new Random();
            int delay = 100 + random.nextInt(400); // 100ms to 500ms delay
            Thread.sleep(delay);  // Sleep for the random delay

            // Print the letter
            System.out.print(letter + " ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create and start a thread for each letter of the alphabet
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            AlphabetThread thread = new AlphabetThread(letter);
            thread.start();
        }
    }
}
