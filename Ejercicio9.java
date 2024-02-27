import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un año");
        int año = teclado.nextInt();

        if (año % 400 == 0)
        {
            System.out.println("Si es bisiesto");
        }

        else if (año % 100 == 0)
        {
            System.out.println("No es bisiesto");
        }

        else if(año % 4 == 0)
        {
            System.out.println("Si es bisiesto");
        }

        else 
        {
            System.out.println("No es bisiesto");
        }








    }
}
