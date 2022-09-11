import java.util.Scanner;

public class Trapping_Rain_Water {
    //Driver Code
    private static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int lmax = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] >= lmax) {
                left[i] = height[i];
                lmax = height[i];
            } else {
                left[i] = lmax;
            }
        }
        lmax = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (height[i] > lmax) {
                right[i] = height[i];
                lmax = height[i];
            } else {
                right[i] = lmax;
            }
        }
        int count = 0;
        for (int i = 0; i < height.length; i++) {
            count = count + Math.min(left[i], right[i]) - height[i];
        }
        return count;
    }
}

