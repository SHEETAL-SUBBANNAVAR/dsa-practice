class RightAngledTriangleStarPattern {
    public static void main(String[] args) {
        int n = 5; // You can change this value to print a larger or smaller triangle
        RightAngledTriangle(n);
    }

    public static void RightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}