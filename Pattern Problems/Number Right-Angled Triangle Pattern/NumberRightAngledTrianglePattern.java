/*              Problem: Number Right-Angled Triangle Pattern  
       Write a Java program to print a right-angled triangle pattern using numbers.
Input:
An integer n representing number of rows.

Output:
A triangle where each row contains numbers from 1 to row number.

Example:
Input: 5
Output:
1
12
123
1234
12345 
*/
 class NumberRightAngledTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        rightAngled(n);
    }
    public static void rightAngled(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    
}