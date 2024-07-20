import java.util.*;

public class Solution{
    private static Boolean helper(Map<Integer,Integer> m,int[] arr){
        for(int i : arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> mp : m.entrySet()){
            int key = mp.getKey();
            int val = mp.getValue();

            if(val%2 == 1) return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            Map<Integer,Integer> m = new HashMap<>();
            boolean ans = helper(m,arr);
            
            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
