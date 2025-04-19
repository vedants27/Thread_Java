//EvenThread.java

// Class to print even numbers using a separate thread
public class EvenThread extends Thread {
    // Function to print even numbers from 0 to 10
    private void printEvenNumbers() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("EvenThread: " + i);
            try {
                Thread.sleep(500); // Pause for readability
            } catch (InterruptedException e) {
                System.out.println("EvenThread interrupted.");
            }
        }
    }
