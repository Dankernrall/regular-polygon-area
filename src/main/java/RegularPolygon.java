import java.util.Scanner;

public class RegularPolygon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double side = in.nextDouble();
        if (n > 2 & side > 1) {
            System.out.println(area(n, side));
        } else {
            System.out.println("NO");
        }

    }

    public static double area(int n, double side) {
        double S = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        return S;
    }
}

