package lr6;

import java.util.Arrays;

public class Example7 {
    public static int[] codeChar(char[] arr){
        int[] codeArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            codeArr[i] = arr[i];
        }
        return codeArr;
    }
    public static void main(String[] args) {
        System.out.println("Вывод массива с кодами символьных элементов: " + Arrays.toString(codeChar(new char[]{'a', 'z', '2', 't', '.'})));
    }
}
