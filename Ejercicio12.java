import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el valor en x del primer punto");
        int x1 = teclado.nextInt();
        System.out.println("Digite el valor en y del primer punto");
        int y1 = teclado.nextInt();
        System.out.println("Digite el valor en x del segundo punto");
        int x2 = teclado.nextInt();
        System.out.println("Digite el valor en x del segundo punto");
        int y2 = teclado.nextInt();

        double distancia = Math.sqrt(Math.pow(x2-x1, 2) - Math.pow(y2-y1, 2));

        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
