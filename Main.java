import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) A[i] = sc.nextInt();
            for (int i = 0; i < N; i++) B[i] = sc.nextInt();

            // Create a list of pairs (A[i], B[i])
            List<int[]> cards = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                cards.add(new int[]{A[i], B[i]});
            }

            // Sort cards by A[i] in descending order
            cards.sort((x, y) -> Integer.compare(y[0], x[0]));

            int maxB1 = cards.get(0)[1];
            int maxB2 = (N > 1) ? cards.get(1)[1] : Integer.MIN_VALUE;

            boolean aliceWins = false;
            for (int i = 0; i < N; i++) {
                int aliceMax = Math.max(A[i], B[i]);
                int bobMax = (A[i] == cards.get(0)[0]) 
                    ? Math.max(cards.get(1)[0], maxB2) 
                    : Math.max(cards.get(0)[0], maxB1);

                if (aliceMax > bobMax) {
                    aliceWins = true;
                    break;
                }
            }

            System.out.println(aliceWins ? "Yes" : "No");
        }
        sc.close();
    }
}
