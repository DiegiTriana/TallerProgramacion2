import java.util.Scanner;

public class Ejercicio6PDF2 {
     public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.");

        System.out.println("Porfavor introduzca su Edad");
        int edad = teclado.nextInt();
        System.out.println("Porfavor introduzca su Nota");
        double nota = Double.parseDouble(teclado.next());
        System.out.println("Porfavor introduzca su genero (M o F)");
        char sexo = Character.toUpperCase(teclado.next().charAt(0));
        
        
        if (edad < 18 )
        {
            System.out.println("No tiene suficiente edad para aceptar su solicitud");
        }

        if (nota < 5.0 )
        {
            System.out.println("No tiene la suficiente nota para su solicitud");
        }

        if (sexo !='M' && sexo !='F' )
        {
            System.out.println("No se selecciono correctamente su genero, volver a intentar");
        }
        else
        {
            System.out.println("Tiene los requisitos para la solicitud");
        }
    }
}
