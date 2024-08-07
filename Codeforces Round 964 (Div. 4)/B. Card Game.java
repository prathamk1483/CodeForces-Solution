import java.util.Scanner;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases
 
        while (t-- > 0) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
 
            int winCount = 0;
            winCount += countWins(a1, a2, b1, b2);
            winCount += countWins(a1, a2, b2, b1);
            winCount += countWins(a2, a1, b1, b2);
            winCount += countWins(a2, a1, b2, b1);
 
            System.out.println(winCount);
        }
 
        scanner.close();
    }
 
    public static int countWins(int s1, int s2, int sl1, int sl2) {
        int suneetWins = 0;
        int slavicWins = 0;
 
        if (s1 > sl1) {
            suneetWins++;
        } else if (s1 < sl1) {
            slavicWins++;
        }
        if (s2 > sl2) {
            suneetWins++;
        } else if (s2 < sl2) {
            slavicWins++;
        }
 
        if (suneetWins > slavicWins) {
            return 1;
        }
        return 0;
    }
}
