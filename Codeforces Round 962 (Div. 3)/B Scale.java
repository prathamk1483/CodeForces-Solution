import java.util.*;

class Codechef {
    private static void helper(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        List<char[]> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            arr.add(temp.toCharArray());
        }

        for (int i = 0; i < n; i += k) {
            for (int j = 0; j < n; j += k) {
                System.out.print(arr.get(i)[j]);
            }
            System.out.println();
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
