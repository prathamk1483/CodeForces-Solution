import java.util.Scanner;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();  
            int m = scanner.nextInt();
            
            int[] starts = new int[n];
            int[] ends = new int[n];
            
            for (int i = 0; i < n; i++) {
                starts[i] = scanner.nextInt();
                ends[i] = scanner.nextInt();
            }
            if (starts[0] >= s) {
                System.out.println("YES");
                continue;
            }
 
            boolean canShower = false;
            for (int i = 1; i < n; i++) {
                if (starts[i] - ends[i - 1] >= s) {
                    canShower = true;
                    break;
                }
            }
 
            if (!canShower && (m - ends[n - 1] >= s)) canShower = true;
       
            
            if (canShower) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scanner.close();
    }
}
