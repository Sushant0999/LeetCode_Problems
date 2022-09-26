public class Majority_Element {
    public int majorityElement(int[] nums) {
        int count = 0, answerIndex = 0, n = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[answerIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                answerIndex = i;
                count = 1;
            }
        }
        int answer = nums[answerIndex];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == answer) {
                count++;
            }
            if (count > n / 2) {
                break;
            }
        }
        return answer;
    }
}
