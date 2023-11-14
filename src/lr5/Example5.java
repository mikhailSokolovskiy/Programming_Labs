package lr5;

public class Example5 {
    public static void main(String[] args) {
        class MyClass {
            private int num;

            public void set(int number){
                this.num = Math.min(number, 100);
                System.out.println("Set value with arg: " + this.num);
            }
            public void set(){
                this.num = 0;
                System.out.println("Set value without arg: " + this.num);
            }
            public void show(){
                System.out.println("Check value: " + this.num);
            }
            public MyClass(int num) {
                this.num = num;
                System.out.println("Analogue of the first method using the constructor: " + this.num);
            }
        }

        MyClass _myClass = new MyClass(12);
        _myClass.set(75);
        _myClass.set();
        _myClass.set(221);
        _myClass.show();

    }
}
