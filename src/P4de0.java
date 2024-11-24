import java.util.Scanner;

public class P4de0 {
    public static void main(String[] args) {
        int a,b,c,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de hormigas: ");
        a = sc.nextInt();
        System.out.print("Introduzca el número de arañas: ");
        b = sc.nextInt();
        System.out.print("Introduzca el número de cochinillas: ");
        c = sc.nextInt();

        s = (a*6) + (b*8) + (c*14);
        System.out.print("Total de patas: " + s);

        sc.close();
    }
}
