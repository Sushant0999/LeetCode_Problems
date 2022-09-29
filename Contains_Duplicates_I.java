//Link : https://leetcode.com/problems/contains-duplicate/discussion/

import java.util.Arrays;
import java.util.HashSet;

public class Contains_Duplicates_I {

    //Brute-Force
//    public boolean containsDuplicate(int[] nums) {
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //Optimized
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums); //O(NLogN)
//        int check = 0;
//        for(int i = 0; i < nums.length - 1; i++){
//            check = nums[i];
//            if(nums[i + 1] == check){
//                return true;
//            }
//        }
//        return false;
//    }

    //More Optimized
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
