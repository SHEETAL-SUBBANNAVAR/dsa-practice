public class Check_sorted_rotated_array {   
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};
        boolean result1 = checkSortedRotated(arr1);
        boolean result2 = checkSortedRotated(arr2);
        System.out.println(result1); 
        System.out.println(result2); 
    }
    public static boolean checkSortedRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    
}