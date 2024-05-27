package leetcode;

public class Task_27 {
    public int removeElement(int[] nums, int val) {
        int k = 0; // переменная для подсчета количества элементов, не равных val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
