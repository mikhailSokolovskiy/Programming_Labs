package lr12;

public class Example4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            int threadNumber = i;
            new Thread(() -> {
                System.out.println("Номер потока " + threadNumber);
            }).start();
        }
    }
}
