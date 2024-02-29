import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Porfavor digite un numero entero");
        int numero = teclado.nextInt();

        double raiz2 = Math.sqrt(numero);
        double raiz3 = Math.cbrt(numero);

        System.out.println("La raiz cuadrada del numero es: " + raiz2);
        System.out.println("La raiz cubica del numero es: " + raiz3);
    }
}
