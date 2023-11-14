package lr5;

public class Example6 {
    public static void main(String[] args) {
        class MyClass {
            private int min;
            private int max;

            public void set(int _min, int _max){
                this.min = _min;
                this.max = _max;
                if (_min > _max){
                    this.max = _min;
                    this.min = _max;
                }
            }

            public void set(int _val){
                if (this.min >= _val){
                    this.max = this.min;
                    this.min = _val;
                }else{
                    this.max = _val;
                }
            }

            public void show(){
                System.out.println("Min value: " + this.min + "; Max value: " + this.max);
            }

            public MyClass(int _min, int _max) {
                this.min = _min;
                this.max = _max;
                if (_min > _max){
                    this.max = _min;
                    this.min = _max;
                }
                show();
            }

            public MyClass(int _val){
                if (this.min >= _val){
                    this.max = this.min;
                    this.min = _val;
                }else{
                    this.max = _val;
                }
                show();
            }
        }

        MyClass _myClass2 = new MyClass(247, 61);
        MyClass _myClass = new MyClass(33);
        _myClass.set(12, 24);
        _myClass.show();
        _myClass.set(10);
        _myClass.show();
        _myClass.set(48);
        _myClass.show();
        _myClass.set(73, 7);
        _myClass.show();

    }
}
