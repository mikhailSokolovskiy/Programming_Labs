package leetcode;

import java.util.HashMap;

public class Task_13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "III";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + romanToInt(s1));

        String s2 = "LVIII";
        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + romanToInt(s2));

        String s3 = "MCMXCIV";
        System.out.println("\nInput: " + s3);
        System.out.println("Output: " + romanToInt(s3));
    }
}
