import java.util.Scanner;

public class Ejercicio3 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Porfavor, digite un numero");
        float numero1 = teclado.nextInt();
        System.out.println("Porfavor, digite otro numero");
        float numero2 = teclado.nextInt();
        
        if (numero2==0)
        {
            System.out.println("Hubo un error");
        }
        
        else 
        {
            System.out.println("El resultado es: " + numero1 / numero2);
        }
        
        
        
        
    }

}
