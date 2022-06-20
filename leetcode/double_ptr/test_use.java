import java.util.Arrays;
import java.lang.Object;
public class test_use
{
    public static void main(String[] args) {

        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3;
        int n = 3;

        int[] merged = Arrays.addAll(nums1, nums2);
        

        Arrays.sort(merged);
        

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = merged[i];
        }

    }
}
