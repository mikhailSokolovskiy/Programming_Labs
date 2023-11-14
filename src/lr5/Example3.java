package lr5;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        class MyClass {
            private int dec1;
            private int dec2;

            public MyClass() {
                System.out.println("First constructor");
            }

            public MyClass(int dec1) {
                this.dec1 = dec1;
                System.out.println("Second constructor. Input first value: " + this.dec1);
            }

            public MyClass(int dec1, int dec2) {
                this.dec1 = dec1;
                this.dec2 = dec2;
                System.out.println("Third constructor. Sum of input values: " + (this.dec1 + this.dec2));
            }



        }
        System.out.println("Введите 2 числа");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        MyClass _myClass1 = new MyClass();
        MyClass _myClass2 = new MyClass(num1);
        MyClass _myClass3 = new MyClass(num1, num2);
    }
}
