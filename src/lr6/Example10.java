package lr6;

import java.util.Arrays;

public class Example10 {
    public static int[] MaxMinArr(int... args){
        int[] arr = new int[2];
        int max = 0;
        int min = args[0];
        for (int arg : args){
            if (arg > max) max = arg;
            if (arg < min) min = arg;
        }
        arr[0] = max;
        arr[1] = min;
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Массив с наибольшим и наименьшим значением из введенных: " + Arrays.toString(MaxMinArr(1, 2, 3, 4, 5, 6, 22, 41, 2)));
    }
}
