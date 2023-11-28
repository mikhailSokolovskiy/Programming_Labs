package lr6;

import java.sql.PreparedStatement;

public class Example9 {
    public static char[] swapArr(char[] arr){
        char symb;
        for (int i = 0; i < (arr.length / 2); i++){
            symb = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = symb;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(swapArr(new char[] {'1', '2', '3', '4', '5', '7'}));
        System.out.println(swapArr(new char[] {'1', '2', '3', '4', '5'}));
    }
}
