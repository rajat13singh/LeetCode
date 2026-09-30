import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int possibility1=nums[0] * nums[1] * nums[n - 1];//it will check the max three number prouct negative excluded
        int possibility2=nums[n - 3] * nums[n - 2] * nums[n - 1];//it will make a product of 2 smallest and one biggest here it will check negative

        return Math.max(possibility1,possibility2);
    
    }
}
        
        
    
