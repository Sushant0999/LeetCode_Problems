//Link : https://leetcode.com/problems/two-sum/
public class Two_Sum {
    //Driver Code
    private static int[] twoSum(int[] nums, int target) {
        int[] x = new int[2];
        outer:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    x[0] = i;
                    x[1] = j;
                    break outer;
                }
            }
        }
        return x;
    }
}
