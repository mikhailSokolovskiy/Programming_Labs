package lr6;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        class MyClass {
            private char symb;
            private String str;

            public void Set(char symb) {
                this.symb = symb;
            }

            public void Set(String str) {
                this.str = str;
            }

            public void show() {
                System.out.println("Символьное поле: " + symb);
                System.out.println("Текстовое поле: " + str);
            }

            public void Set(char[] chararray) {
                if (chararray.length < 2){
                    this.symb = chararray[0];
                } else {
                    this.str = String.copyValueOf(chararray);
                }

            }
        }
        char[] chararray1 = {'.'};
        char[] chararray2 = {'p', 'r', 'i', 'v', 'e', 't'};
        MyClass _myClass = new MyClass();
        _myClass.Set('z');
        _myClass.Set("Hello");
        _myClass.show();
        _myClass.Set(chararray1);
        _myClass.Set(chararray2);
        _myClass.show();

    }
}
