 import java.util.*;

public class Main {

    // function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // function to check perfect number
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            boolean prime = isPrime(num);
            boolean perfect = isPerfect(num);

            if (prime && perfect) {
                System.out.println("Both");
            } else if (prime) {
                System.out.println("Prime");
            } else if (perfect) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }

        sc.close();
    }
}
