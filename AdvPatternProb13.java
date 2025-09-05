// e 
// d e
// c d e
// b c d e
// a b c d e
public class AdvPatternProb13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (char j = (char)('e' - i + 1); j <= 'e'; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}