import java.util.Scanner;

public class Trapping_Rain_Water {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = s.nextInt();
        }
        System.out.println(trap(height));
    }
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

