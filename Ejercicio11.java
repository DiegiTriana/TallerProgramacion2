import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite un numero");
        int numero1 = teclado.nextInt();
        System.out.println("Digite otro numero");
        int numero2 = teclado.nextInt();

        int distancia = Math.abs(numero1 - numero2);

        System.out.println("La distancia entre los 2 numeros es de: " + distancia);



    }
}
