//         a         
//       a b a       
//     a b c b a     
//   a b c d c b a   
// a b c d e d c b a 
import java.util.*;

public class AdvPatternProb12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Num of rows : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (char j = 'a'; j < 'a'+i; j++) {
                System.out.print(j+" ");
            }
            for (char j = (char)('a' + i - 2); j >= 'a'; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}