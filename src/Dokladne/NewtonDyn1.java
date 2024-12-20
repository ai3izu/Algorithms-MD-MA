package Dokladne;

public class NewtonDyn1 {

    final static int N = 10;
    final static int K = 3;

    public static void main(String[] args) {
        int[][] tab = new int[N + 1][K + 1];


        for (int n = 0; n <= N; n++) {
            for (int k = 0; k <= K; k++) {

                if (k == 0 || k == n) {
                    tab[n][k] = 1;
                }
                if (k > 0 && n > k) {
                    tab[n][k] = tab[n - 1][k - 1] + tab[n - 1][k];
                }

            }
        }

        System.out.println("Wynik = " + tab[N][K]);
        System.out.println("Wynik = " + netwonDZ(N, K));

    }

    public static int netwonDZ(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (0 < k && k < n) {
            return netwonDZ(n-1, k-1) + netwonDZ(n-1, k);
        }
        return -1;
    }
}
