class SolidSquarePattern {
    public static void main(String[] args) {
        int n = 5; // Size of the square
        printSolidSquare(n);
    }

    public static void printSolidSquare(int n) {
        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < n; j++) { // Loop through columns
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
