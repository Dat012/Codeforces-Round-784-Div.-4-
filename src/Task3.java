import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int countC = 0;
            int cc = 0;
            int cn = 0;
            int countN = 0;
            int nn = 0;
            int nc = 0;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    countC++;
                    if (arr[j] % 2 == 0) {
                        cc++;
                    } else {
                        cn++;
                    }
                } else {
                    countN++;
                    if (arr[j] % 2 == 1) {
                        nn++;
                    } else {
                        nc++;
                    }
                }
            }
            if ((countC == cc || countC == cn) && (countN == nn || countN == nc)) {
                res[i] = "YES";
            } else {
                res[i] = "NO";
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }
}