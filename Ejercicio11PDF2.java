import java.util.Scanner;
public class Ejercicio11PDF2 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite la cantidad de alumnos para el viaje");
        int alumnos = teclado.nextInt();
        
        if (alumnos >= 100)
        {
            System.out.println("El pago a la agencia es: " + alumnos*65 + "" + " \n Cada alumno paga un total de 65 euros");
        }

        else if (alumnos < 100 && alumnos >= 50 )
        {
            System.out.println("El pago a la agencia es: " + alumnos*70 + "" + " \n Cada alumno paga un total de 70 euros");
        }
        else if (alumnos < 50 && alumnos >= 30)
        {
            System.out.println("El pago a la agencia es: " + alumnos*95 + "" + " \n Cada alumno paga un total de 95 euros");
        }
        else if (alumnos < 30)
        {
            System.out.println("El pago a la agencia es: " + 4000 + " euros" + "" + " \n los alumnos no pagan nada");
        }

    }
}
