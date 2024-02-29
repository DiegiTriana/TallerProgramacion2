import java.util.Scanner;
public class Ejercicio4PDF2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Porfavor, digite una cadena de teclado (Introducir solo letras)");
        String cadena = teclado.nextLine();

        boolean hayMayus = false;

        for (int i=0; i<cadena.length(); i++)
        {
            char caracter = cadena.charAt(i);

            if (Character.isUpperCase(caracter) )
            {
                hayMayus = true;
                break;
            }

        }

        if(hayMayus)
        {
            System.out.println("Hay una mayuscula en la cadena");

        }
        else
        {
            System.out.println("No hay mayuscula en la cadena");
        }

    }

    }

