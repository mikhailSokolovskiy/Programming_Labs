package lr6;

public class Example4 {
    public static int dbFactorial(int num) {
        int res = 1;
        for (int i = num; i >= 0; i = i - 2) {
            if (i == 0 || i == 1)
                return res;
            else
                res *= i;
        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println("Двойной факториал: " + dbFactorial(6));
    }
}
