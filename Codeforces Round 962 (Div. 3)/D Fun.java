import java.io.*;
import java.lang.*;

public class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] tokens = br.readLine().split(" ");
            int n = Integer.parseInt(tokens[0]);
            int x = Integer.parseInt(tokens[1]);

            long count = 0;
            for (int a = 1; a <= x - 2; a++) {
                if (a > n) break;
                for (int b = 1; b <= x - a; b++) {
                    if (a * b > n) break;
                    int maxC = Math.min(x - a - b, (n - a * b) / (a + b));
                    if (maxC > 0) count += maxC;
                }
            }

            out.println(count);
        }

        br.close();
        out.flush();
        out.close();
    }
}
