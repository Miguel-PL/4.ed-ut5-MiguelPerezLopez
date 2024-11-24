import java.util.Scanner;

public class P1de0 {
    public static void main(String[] args) {
        double C1, C2, C3, C4, S, P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor C1: ");
        C1 = sc.nextDouble();
        System.out.println("Ingrese el valor C2: ");
        C2 = sc.nextDouble();
        System.out.println("Ingrese el valor C3: ");
        C3 = sc.nextDouble();
        System.out.println("Ingrese el valor C4: ");
        C4 = sc.nextDouble();

        S = (C1 + C2 + C3 + C4);
        P = S / 4;
        System.out.println("El valor promedio es: " + P);

        sc.close();
    }
}
