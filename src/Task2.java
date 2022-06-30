import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int f = -1;
            int[] arr = new int[n];
            int[] count = new int[n + 2];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                count[arr[i]]++;
            }
            for (int i = 0; i < n + 2; i++) {
                if (count[i] >= 3) {
                    f = i;
                    break;
                }
            }
            if (f > 0) {
                res[j] = f;
            } else {
                res[j] = -1;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }
}