//OddThread.Java

// Class to print odd numbers using a separate thread
public class OddThread extends Thread 
    // Function to print odd numbers from 1 to 9
    private void printOddNumbers() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("OddThread: " + i);
            try {
                Thread.sleep(500); // Pause for readability
            } catch (InterruptedException e) {
                System.out.println("OddThread interrupted.");
            }
        }
    }
    // Overriding the run method to define thread behavior
    @Override
    public void run() {
        printOddNumbers();
    }
}


