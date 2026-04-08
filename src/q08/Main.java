 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] stack = new int[n]; // max size n
        int top = -1;

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            if (op.equals("PUSH")) {
                int x = sc.nextInt();
                if (top < n - 1) {
                    stack[++top] = x;
                }

            } else if (op.equals("POP")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top--]);
                }

            } else if (op.equals("PEEK")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]);
                }

            } else if (op.equals("SIZE")) {
                System.out.println(top + 1);
            }
        }

        sc.close();
    }
}
