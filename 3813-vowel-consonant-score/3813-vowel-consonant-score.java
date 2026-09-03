class Solution {
    public int vowelConsonantScore(String s) {
      int count1 = 0;
      int count2 = 0;
      for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'  ) count1++;
        else count2++;
      }return (count1/count2); 
    }
}