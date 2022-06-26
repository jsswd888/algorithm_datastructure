import java.util.Arrays;
import java.lang.Object;
public class test_use
{
    public static void main(String[] args) {

        /*int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3;
        int n = 3;
        
        //int[] merged = Arrays.addAll(nums1, nums2);
        
        
        //Arrays.sort(merged);
        
        
        //for (int i = 0; i < nums1.length; i++) {
        //    nums1[i] = merged[i];
        //}
        
        int b = -135;
        String a = Integer.toString(b);
        
        String[] temp = new String[] {"3", "2", "1","-" };
        int len = temp.length;
        String[] dest = new String[temp.length];
        String[] negative_dest = new String[temp.length];
        if (temp[0].equals("-")) {
            for (int i = 1; i < dest.length; i++) {
                dest[len - 1] = temp[i];
                len--;
            }
        }
        if (dest[dest.length - 1] == "-") {
            System.arraycopy(dest, 0, negative_dest, 0, dest.length - 1);
            dest[0] = "-";
        }
        
        long reverse = Long.parseLong(String.join("", dest));
        System.out.println(Arrays.toString(dest));
        System.out.println(String.join("", dest));
        System.out.println("reverse: " + reverse);
        //long d = Long.parseLong(String.join("", c));
        //System.out.println(a.charAt(0));
        //System.out.println(d);*/
        
        int[] nums = new int[]{4,2,3};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
    int count = 0;
    for (int i = 1, temp = 0; i < nums.length - 1; i++) {
        System.out.println(nums[i] + "Runned");
        if(nums[i] < nums[i-1]){
            if(count > 1 || nums[i+1] <= nums[i-1]) return false;
            else {
                count++;
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
    }
    return count <=1;
    }
}
