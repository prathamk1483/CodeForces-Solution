import java.util.Scanner;
 
public class Codechef {
    private static void helper(Scanner scanner){
        String s = scanner.nextLine();
        String t = scanner.nextLine();
 
        char[] sArray = s.toCharArray();
        int sLength = sArray.length;
        int tLength = t.length();
        
        int j = 0;
        for (int i = 0; i < sLength; i++) {
            if (j < tLength && (sArray[i] == t.charAt(j) || sArray[i] == '?')) {
                if (sArray[i] == '?') {
                    sArray[i] = t.charAt(j);
                }
                j++;
            }
        }
 
        if (j < tLength) {
            System.out.println("NO");
        } 
        else {
            for (int i = 0; i < sLength; i++) {
                if (sArray[i] == '?') {
                    sArray[i] = 'a';
                }
            }
            System.out.println("YES");
            System.out.println(new String(sArray));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            helper(sc);
        }
        
        sc.close();
    }
}
