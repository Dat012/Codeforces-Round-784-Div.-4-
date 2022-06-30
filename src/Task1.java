import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] div = new int[t];
        for (int i = 0; i < t; i++) {
            div[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            if (div[i] <= 1399) {
                System.out.println("Division 4");
            }
            else if (div[i] <= 1599) {
                System.out.println("Division 3");
            }
            else if (div[i] <= 1899) {
                System.out.println("Division 2");
            }
            else {
                System.out.println("Division 1");
            }
        }
    }
}