import java.util.*;

public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int arr[] = new int[n];

            for(int i=y-1;i>=0;i-=2){
                arr[i] = -1;
            }
            for(int i=y-1;i>=0;i-=2) arr[i] = 1;

            for(int i=y;i<x;i++) arr[i] = 1;

            for(int i=x;i<arr.length;i+=2) arr[i] = -1;
            for(int i=x+1;i<arr.length;i+=2) arr[i] = 1; 

            for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
            System.out.println();
            
        }
    }
}
