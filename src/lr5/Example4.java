package lr5;

public class Example4 {
    public static void main(String[] args) {

        class MyClass {
            private int num;
            private char symb;

            public MyClass(int num, char symb) {
                this.num = num;
                this.symb = symb;
                System.out.println("Int value: " + this.num);
                System.out.println("Char value: " + this.symb);
            }

            public MyClass(double flVal){
                this.num = (int) ((flVal - (int)flVal) * 100);
                char ch = (char) flVal;
                this.symb = (char) flVal;
                System.out.println("Int part of value: " + ch);
                System.out.println("Float part of value: " + this.num);
            }

        }

        MyClass _myClass1 = new MyClass(12, 'a');
        MyClass _myClass2 = new MyClass(221.1265);
    }
}
