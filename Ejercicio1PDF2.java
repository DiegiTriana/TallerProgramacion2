import java.util.Scanner;
/**
 *
 * @author Diego Triana
 */
public class Ejercicio1PDF2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Programa para calcular cual de 2 numeros es el mayor");
        System.out.println("Hola, porfavor digite un numero");
        int numero1 = teclado.nextInt();
        System.out.println("Digete otro numero");
        int numero2 = teclado.nextInt();
        
        if (numero1 > numero2)
        {
           System.out.println("Este es el mayor: " + numero1);
        }
        else if (numero2 > numero1)
        {
          System.out.println("Este es el mayor: " + numero2);
        }
        else 
        {
            System.out.println("Son iguales");
        }
        
    }
    
}