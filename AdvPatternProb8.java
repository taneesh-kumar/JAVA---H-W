// Pattern 1 :       
//         *         
//       * * *       
//     * * * * *     
//   * * * * * * *   
// * * * * * * * * * 

// Pattern 2 :
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *
import java.util.*;

public class AdvPatternProb8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Num of rows : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Pattern 1 :");
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern 2 :");
        for (int i = n; i >= 1; i--) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}