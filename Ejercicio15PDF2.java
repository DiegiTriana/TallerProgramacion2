import java.util.Scanner;
public class Ejercicio15PDF2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba un numero entero del 1 al 12 para seleccionar un mes del año");
        System.out.println(" 1.- Enero.");
        System.out.println(" 2.- Febreo.");
        System.out.println(" 3.- Marzo.");
        System.out.println(" 4.- Abril.");
        System.out.println(" 5.- Mayo.");
        System.out.println(" 6.- Junio.");
        System.out.println(" 7.- Julio.");
        System.out.println(" 8.- Agosto.");
        System.out.println(" 9.- Septiembre.");
        System.out.println("10.- Octubre.");
        System.out.println("11.- Noviembre.");
        System.out.println("12.- Diciembre.");
        int numero = teclado.nextInt();
        System.out.println("¿El año es bisiesto? (Si/No)");
        String bisiesto = teclado.next().toUpperCase() ; teclado.nextLine();

        if( numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 8 || numero == 10 || numero == 12)
        {
            System.out.println("El mes tiene 31 dias.");
        }
        else if( bisiesto.equals("SI") && numero ==2)
        {
            System.out.println("El mes tiene 29 dias.");
        }
        else if( bisiesto.equals("NO") && numero ==2)
        {
            System.out.println("El mes tiene 28 dias.");
        }
        else if( numero == 4 || numero == 6 || numero == 9 || numero == 11)
        {
            System.out.println("El mes tiene 30 dias.");
        }
        else 
        {
            System.out.println("Error: digito un numero erroneo para los meses o no selecciono correctamen si era año bisiesto o no");
        }
    }
}
