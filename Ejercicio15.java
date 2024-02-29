import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el valor de A");
        int A = teclado.nextInt();
        System.out.println("Digite el valor de B");
        int B = teclado.nextInt();

        int C = B;
        B = A;
        A = C;

        System.out.println("Los valores invertidos son: " + "A = " + A + " B = " + B);

    }
}
