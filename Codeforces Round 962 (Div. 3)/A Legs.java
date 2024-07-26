import java.io.*;
import java.util.*;

public class Codechef{
    private static void helper(FastReader sc, PrintWriter out) {
        int n = sc.nextInt();

        if(n < 4){
            out.print(n/2+"\n");
            return;
        }
        else if(n == 4){
            out.print(n/4+"\n");
            return;
        }

        out.print((n/4 + (n%4)/2)+"\n");
        return;
    }
    public static void main(String[] args) 
    { 
        FastReader sc = new FastReader(); 
        PrintWriter out=new PrintWriter(System.out);
        int t = sc.nextInt();

        while(t-->0){
            helper(sc,out);
        }
        out.flush();
    } 


    static void reverseArray(int arr[]){for(int i=0;i<arr.length/2;i++){int temp = arr[i];arr[i] = arr[arr.length-1-i];arr[arr.length-1-i] = temp;}return;}
    static class FastReader { BufferedReader br; StringTokenizer st; public FastReader() { br = new BufferedReader( new InputStreamReader(System.in)); } String next() { while (st == null || !st.hasMoreElements()) { try { st = new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); } } return st.nextToken(); } int nextInt() { return Integer.parseInt(next()); } long nextLong() { return Long.parseLong(next()); } double nextDouble() { return Double.parseDouble(next()); } String nextLine() { String str = ""; try { if(st.hasMoreTokens()){ str = st.nextToken("\n"); } else{ str = br.readLine(); } } catch (IOException e) { e.printStackTrace(); } return str; } }
    static boolean isPowerOfTwo(int x){return (x != 0 && (x&(x-1)) == 0);}
}
