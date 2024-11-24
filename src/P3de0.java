import java.util.Scanner;

public class P3de0 {
    public static void main(String[] args) {
        double a, b, c, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la primera distancia en milímetros: ");
        a = sc.nextDouble();
        System.out.print("Ingrese la segunda distancia en centímetros: ");
        b = sc.nextDouble();
        System.out.print("Ingrese la tercera distancia en metros: ");
        c = sc.nextDouble();

        s = (a/10) + b + (c * 100);
        System.out.print("Distancia total: " + s + " cm");

        sc.close();
    }
}
