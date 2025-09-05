// A         
// A B       
// A B C     
// A B C D   
// A B C D E 
import java.util.*;

public class AdvPatternProb11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num of rows : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}