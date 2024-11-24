import java.util.Scanner;

public class P22de0 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, raiz;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c = sc.nextDouble();


        if (a == 0) {
            System.out.print("El denominador no puede ser 0");
        } else {
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante < 0) {
                System.out.print("No existen soluciones reales");
            }
            else {
                raiz = Math.sqrt(discriminante);
                x1 = (-b + raiz) / (2 * a);
                x2 = (-b - raiz) / (2 * a);
                System.out.println("La solucion 1 es: " + x1);
                System.out.print("La solucion 2 es: " + x2);

            }
        }
    }
}
