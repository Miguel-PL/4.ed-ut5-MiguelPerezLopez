import java.util.Scanner;

public class P21de0 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        a = sc.nextInt();
        System.out.print("Ingrese el més: ");
        b = sc.nextInt();

        if ((a >= 1  && a <= 28) && b == 2) {
                System.out.print("Fecha correcta: " + a + "/" + b);
        }
            else if (a >= 1 && a <= 30 && (b == 4 || b == 6 || b == 9 || b == 11)) {
                System.out.print("Fecha correcta: " + a + "/" + b);
            }
            else if (a >= 1 && a <= 31 && (b == 1 || b == 3 || b == 5 || b ==7 || b ==8 || b ==10 || b ==12)){
                System.out.print("Fecha correcta: " + a + "/" + b);
            }
            else {
                System.out.print("Fecha incorrecta");
            }
            sc.close();
    }
}

