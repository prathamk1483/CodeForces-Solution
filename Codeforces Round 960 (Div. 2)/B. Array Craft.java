import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- >0){
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        x--;y--;
        int arr[] = new int[n];
    
        for(int i=y;i<=x;i++) arr[i] = 1;
        
        for(int i=y-1;i>=0;i--) arr[i] = ((y-i)%2 == 1) ? -1 :1; 
        for(int i=x+1;i<arr.length;i++) arr[i] = ((i-x)%2 == 1 ) ? -1 :1; 
        
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
      }
  }
}
