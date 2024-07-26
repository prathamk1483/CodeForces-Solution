import java.io.*;
import java.util.*;
 
public class Codechef {
    private static void preprocess(String s, int[][] prefixFreq) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < 26; j++) {
                prefixFreq[i + 1][j] = prefixFreq[i][j];
            }
            prefixFreq[i + 1][ch - 'a']++;
        }
    }
 
    private static int[] getFreqInRange(int l, int r, int[][] prefixFreq) {
        int[] freq = new int[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = prefixFreq[r + 1][i] - prefixFreq[l][i];
        }
        return freq;
    }
 
    private static int helper(String a, String b, int l, int r, int[][] prefixFreqA, int[][] prefixFreqB) {
        int[] freqA = getFreqInRange(l, r, prefixFreqA);
        int[] freqB = getFreqInRange(l, r, prefixFreqB);
 
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(freqA[i] - freqB[i]);
        }
 
        return ans / 2; 
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
 
            String a = br.readLine();
            String b = br.readLine();
 
            int[][] prefixFreqA = new int[n + 1][26];
            int[][] prefixFreqB = new int[n + 1][26];
 
            preprocess(a, prefixFreqA);
            preprocess(b, prefixFreqB);
 
            while (q-- > 0) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken()) - 1;
                int r = Integer.parseInt(st.nextToken()) - 1;
 
                out.println(helper(a, b, l, r, prefixFreqA, prefixFreqB));
            }
        }
 
        out.flush();
        out.close();
    }
}
