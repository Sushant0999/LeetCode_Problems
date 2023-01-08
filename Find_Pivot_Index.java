//link -: https://leetcode.com/problems/find-pivot-index/description/
public class Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0, arrSum = 0;
        for(int i = 0; i < n; i++){
            arrSum = arrSum + nums[i];
        }
        for(int i = 0; i < n; i++){
            right = arrSum - nums[i];
            if(right == left){
                return i;
            }
            arrSum = arrSum - nums[i];
            left = left + nums[i];
        }
        return -1;
    }
}
