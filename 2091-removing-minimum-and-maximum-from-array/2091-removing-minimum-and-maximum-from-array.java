class Solution {
    public int minimumDeletions(int[] nums) {
        int minindex = 0;
        int maxindex = 0;
        int n =nums.length;
        int min = nums[0];
        int max = nums[0];
        for(int i =1 ;i<n;i++){
            if(nums[i] < min ){
                min = nums[i] ;
                minindex = i ;
            }else if(nums[i] > max ){
                max = nums[i];
                maxindex = i;
            }
        }int left = Math.max(minindex, maxindex) + 1;

        int right = n - Math.min(minindex, maxindex);

        int both = Math.min(minindex, maxindex) + 1+ n - Math.max(minindex, maxindex);

        return Math.min(left, Math.min(right, both));
    }
}