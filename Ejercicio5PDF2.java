import java.util.Scanner;
public class Ejercicio5PDF2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Porfavor introduzca el numero a elevar");
        double numero = teclado.nextDouble();
        System.out.println("Porfavor introduzca el exponente con la que el numero va a ser elevado");
        double potencia = teclado.nextDouble();
        
        if (potencia>0)
        {
         double elevado = Math.pow(numero, potencia);
         System.out.println("La potencia es: " + elevado);
        }
        
        if(potencia == 0)
        {
            System.out.println("La potencia es: 1");
        }
        
        if (potencia < 0)
        {
            double elevado2 = 1 / Math.pow(numero, potencia);
            System.out.println("La potencia es: " + elevado2);
        }
                
        
        
    }
}
