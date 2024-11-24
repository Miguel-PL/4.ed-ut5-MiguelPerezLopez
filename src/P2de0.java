import java.util.Scanner;

public class P2de0 {
    public static void main(String[] args) {
        int a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextInt();
        System.out.print("Ingrese el valor de c: ");
        c = sc.nextInt();
        System.out.print("Ingrese el valor de x: ");
        x = sc.nextInt();

        y = a * (x * x) + b * x + c;
        System.out.print("El valor de y es: " + y);

        sc.close();
    }
}
