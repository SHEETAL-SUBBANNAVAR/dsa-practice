class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
       
        for(int j=0;j<nums1.length;j++){
        for(int i=0;i<nums2.length;i++){
            if(nums1[j] == nums2[i] && !set.contains(nums1[j])){
                set.add(nums1[j]);
            }
            
        }
        }  
        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}