// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4
public class AdvPatternProb15 {
    public static void main(String[] args) {
        int n = 4;  // outermost number
        int size = 2 * n - 1; // matrix size (7x7)

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Find minimum distance from any border
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));

                // Calculate value to print
                int value = n - min;

                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
