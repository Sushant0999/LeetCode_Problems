// Link : https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        rotatedArray(k,nums);
        System.out.println(Arrays.toString(nums));
    }
    private static int[] rotatedArray(int k, int[] nums) {
        int n = nums.length;
        if(k == 0 || k == n)
            return nums;
        k = k % n;
        rotate(n,k,nums);
        return nums;
    }
    //Brute-Force Approach
    private static void rotate(int n, int k, int[] nums) {
        int[] front = new int[k];
        int[] rear = new int[n - k];
        int loc = 0;
        for (int i = 0; i < n - k; i++){
            rear[loc] = nums[i];
            loc++;
        }
        loc = 0;
        for (int i = n - k; i < nums.length; i++){
            front[loc] = nums[i];
            loc++;
        }
        for (int i = 0; i < front.length; i++){
            nums[i] = front[i];
        }
        loc = 0;
        for (int i = front.length; i < nums.length; i++){
            nums[i] = rear[loc];
            loc++;
        }
    }
}
