 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            // print number
            System.out.print(a);

            // avoid trailing space
            if (i < n - 1) {
                System.out.print(" ");
            }

            // next fibonacci
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
