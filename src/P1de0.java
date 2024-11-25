import java.util.Scanner;

public class P1de0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números desea ingresar?");
        int n = sc.nextInt();
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / n;
        System.out.println("El valor promedio es: " + promedio);
        sc.close();
    }
}

