package lr6;

import java.util.Arrays;

public class Example6 {
    public static int[] ArrTask(int[] arr, int num){
        int[] res = new int[num];
        if (arr.length < num){
            return res = arr;
        }
        for (int i = 0; i < num; i++){
            res[i] = arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrTask(new int[]{2, 3, 4, 5, 1}, 3)));
    }
}
