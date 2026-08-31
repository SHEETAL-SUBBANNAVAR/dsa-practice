class Solution {
    public boolean checkDivisibility(int n) {
        int val = n ; 
        int sum =0;
        int product = 1; 
        while(n > 0 ){
            int rem = n%10;
            sum += rem;
            product *= rem;
            n /= 10 ;
        }return val%(sum+product) == 0?true:false;
    }
}