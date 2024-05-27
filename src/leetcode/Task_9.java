package leetcode;

public class Task_9 {
    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println(isPalindrome(x1)); // true
        System.out.println(isPalindrome(x2)); // false
        System.out.println(isPalindrome(x3)); // false
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
