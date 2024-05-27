package lr13.Task1;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            // throw new ArithmeticException();
        }
        try {
            System.out.println("4");
            throw new ArithmeticException("4");
        } catch (ArithmeticException e) {
            System.out.println("4");
        }
        System.out.println("3");
    }
}
