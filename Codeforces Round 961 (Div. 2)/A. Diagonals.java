import java.io.*;
import java.util.*;

class Solution{
    private static void helper(FastReader sc,PrintWriter out){
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k == 0){ 
            out.print(0+"\n");
            out.flush();
            return;
        }
        else if(k == n*n){
            out.print(2*n-1+"\n");
            out.flush();
            return;
        }
        else if(n == k){
            out.print(1+"\n");
            out.flush();
            return;
        }

        int ans=0;
        for(int i=n;i>0;i--){
           if(k>0 && i == n){
                k-= n;
                ans++;
            }
            else if(k >0 && i<n){
                if(k >= i*2){
                    k-=i*2;
                    ans+=2;
                }
                else{
                    k-=i;
                    ans+=1;
                }
            }
            else break;
        }
        out.print(ans+"\n");
        out.flush();
    }
    public static void main(String[] args) 
    { 
        FastReader sc = new FastReader(); 
        PrintWriter out=new PrintWriter(System.out);
        int t = sc.nextInt();

        while(t-->0){
            helper(sc,out);
        }
    } 



    static class FastReader { BufferedReader br; StringTokenizer st; public FastReader() { br = new BufferedReader( new InputStreamReader(System.in)); } String next() { while (st == null || !st.hasMoreElements()) { try { st = new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); } } return st.nextToken(); } int nextInt() { return Integer.parseInt(next()); } long nextLong() { return Long.parseLong(next()); } double nextDouble() { return Double.parseDouble(next()); } String nextLine() { String str = ""; try { if(st.hasMoreTokens()){ str = st.nextToken("\n"); } else{ str = br.readLine(); } } catch (IOException e) { e.printStackTrace(); } return str; } }
    static boolean isPowerOfTwo(int x){return (x != 0 && (x&(x-1)) == 0);}
}
