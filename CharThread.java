//CharThread.java

// Class to print characters A to Z using a separate thread
public class CharThread extends Thread {
      // Function to print characters from A to Z
    private void printCharacters() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("CharThread: " + c);
            try {
                Thread.sleep(500); // Pause for readability
            } catch (InterruptedException e) {
                System.out.println("CharThread interrupted.");
            }
        }
    }
// Overriding the run method to define thread behavior
    @Override
    public void run() {
        printCharacters();
    }
}


