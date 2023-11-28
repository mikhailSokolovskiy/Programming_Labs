package lr6;

import java.util.Arrays;
import java.util.OptionalInt;

public class Example3 {
    public static void main(String[] args) {
        class MyClass{
            private static int num;

            public static void Set(int... args) {
                for (int arg : args){
                    if (arg > num){
                        num = arg;
                    }
                }
            }
            public static void Show(){
                System.out.println("Наибольшее значение из введенных: " + num);
            }
        }
        int[] arr = {21, 2, 33, 47, 5};
        MyClass.Set(5, 22, 3, 4, 5);
        MyClass.Show();
        MyClass.Set(arr);
        MyClass.Show();

    }
}
