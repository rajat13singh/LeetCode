class Solution {
    public static void Swap(int[] nums,int nz,int z){
        int temp=nums[z];
        nums[z]=nums[nz];
        nums[nz]=temp;
    }
    public void moveZeroes(int[] nums) {
        int nz=0;
        int z=0;
        while(z<nums.length){
            if(nums[z]!=0){
                Swap(nums,nz,z);
                nz++;
            }
            z++;
        }
        
    }
}