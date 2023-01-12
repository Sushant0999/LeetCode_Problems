//link :- https://leetcode.com/problems/running-sum-of-1d-array/
public class Running_sum_of_1D_Array {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] result  = new int[n];
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }
}
