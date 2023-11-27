package lr6;

public class Example2 {
    public static void main(String[] args) {
        class MyClass {
            private static int num = 0;

            public static void SetShow(){
                System.out.println("Текущее значение статического поля: " + num);
                num += 1;
                System.out.println("Увеличенное на еденицу значение статического поля: " + num);
            }
        }
        MyClass.SetShow();
    }
}
