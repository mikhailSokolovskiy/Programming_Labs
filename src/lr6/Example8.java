package lr6;

import java.text.DecimalFormat;

public class Example8 {
    public static double AvgArr(int[] arr){
        double res = 0;
        for (int i = 0; i < arr.length; i++){
            res += arr[i];
        }
        return res/arr.length;
    }
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Среднее значение элементов массива: " + df.format(AvgArr(new int[] {1, 2, 3, 5, 12, 56})));
    }
}
