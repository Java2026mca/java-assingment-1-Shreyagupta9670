 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();

        double area = 0.0;

        if (shape.equals("circle")) {
            double r = sc.nextDouble();
            area = Math.PI * r * r;

        } else if (shape.equals("rectangle")) {
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            area = l * w;

        } else if (shape.equals("triangle")) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        // print with 2 decimal places
        System.out.printf("Area: %.2f", area);

        sc.close();
    }
}
