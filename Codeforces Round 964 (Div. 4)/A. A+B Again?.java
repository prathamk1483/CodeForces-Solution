import java.util.Scanner;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        int[] results = new int[t];
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  
            results[i] = sumOfDigits(n);
        }
        
        for (int result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
 
    public static int sumOfDigits(int n) {
        return (n / 10) + (n % 10);
    }
}
