package lr9;

public class Example2 {
    static void decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        decimalToBinary(42);
    }
}

