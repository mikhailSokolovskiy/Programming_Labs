package lr5;

public class Example1 {
    public static void main(String[] args) {
        class MyClass {
            private char symb;

            public void set(char _symb) {
                symb = _symb;
            }

            public int charCode() {
                return (int) symb;
            }

            public void show() {
                System.out.println("Символ: " + symb);
                System.out.println("Код символа: " + charCode());
            }
        }

        MyClass _myClass = new MyClass();
        _myClass.set('.');
        _myClass.charCode();
        _myClass.show();
    }
}
