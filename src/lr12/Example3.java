package lr12;

public class Example3 {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread();
        evenThread.start();

        Thread oddThread = new OddThread();
        oddThread.start();
    }


}

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}