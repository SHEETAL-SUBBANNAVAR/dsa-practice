class Solution {
    public int lengthOfLastWord(String s) {
        
        s= s.trim();
        
      String [] arr= s.split( " ");
     int n = arr[arr.length - 1].length();
      return n;          
    }
}