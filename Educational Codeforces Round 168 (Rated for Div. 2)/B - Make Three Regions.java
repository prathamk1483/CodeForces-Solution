import java.util.*;
import java.io.*;
 
public class Codechef {
    private static boolean isValidPattern1(String[] s, int j) {
        return s[0].charAt(j - 1) == '.' && s[0].charAt(j + 1) == '.' &&
               s[1].charAt(j) == '.' && s[1].charAt(j - 1) == 'x' && s[1].charAt(j + 1) == 'x';
    }
 
    private static boolean isValidPattern2(String[] s, int j) {
        return s[1].charAt(j - 1) == '.' && s[1].charAt(j + 1) == '.' &&
               s[0].charAt(j) == '.' && s[0].charAt(j - 1) == 'x' && s[0].charAt(j + 1) == 'x';
    }
 
    private static void processTestCase(Scanner sc) {
        int n = sc.nextInt();
        String[] grid = new String[2];
 
        for (int i = 0; i < 2; i++) grid[i] = sc.next();
 
        int count = 0;
 
        for (int j = 1; j < n - 1; j++) {
            if (grid[0].charAt(j) == '.' && isValidPattern1(grid, j)) {
                count++;
            }
            if (grid[1].charAt(j) == '.' && isValidPattern2(grid, j)) {
                count++;
            }
        }
        System.out.println(count);
    }
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            processTestCase(sc);
        }
        sc.close();
    }
}
