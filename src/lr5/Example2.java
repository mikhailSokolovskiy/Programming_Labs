package lr5;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {


        class MyClass{
            private char symb1 = 'A';
            private char symb2 = '.';

            public void result() {
                char ch1;
                char ch2;
                if ((int) symb1 > (int) symb2){
                    ch1 = symb2;
                    ch2 = symb1;
                }
                else {
                    ch1 = symb1;
                    ch2 = symb2;
                }

                for (int i = (int) ch1; i <= (int) ch2; i++){
                    System.out.println((char) i);
                }
            }

        }
        MyClass _myClass = new MyClass();
        _myClass.result();
    }
}
