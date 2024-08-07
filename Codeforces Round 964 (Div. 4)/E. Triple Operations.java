import java.util.Scanner;
 
public class Codechef {
    private static long operationsToZero(long n) {
        if (n == 0) return 0;
        return (long) Math.floor(Math.log(n) / Math.log(3)) + 1;
    }
 
    private static long computeRangeOperations(long l, long r) {
        long totalOperations = 0;
        for (long i = l; i <= r; i++) {
            totalOperations += operationsToZero(i);
        }
        totalOperations += operationsToZero(l);
        return totalOperations;
    }
    
    private static void helper(Scanner sc) {
        long l = sc.nextLong();
        long r = sc.nextLong();
        long result = computeRangeOperations(l, r);
        System.out.println(result);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            helper(sc);
        }
 
        sc.close();
    }
}
