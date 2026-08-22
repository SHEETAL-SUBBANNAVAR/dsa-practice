class Solution {
    public boolean checkRecord(String s) {
        int count1 = 0 ;
        int count2 =0;
        for(int i=0 ;i< s.length();i++){
            if(s.charAt(i)== 'A'){ 
            count1++;
            }
            
            if(s.charAt(i) == 'L' ){
                count2++;
            }else {
                count2=0;
            }
            if(count2 >= 3 || count1 >=2 )return false;
        } return true;

    }
}