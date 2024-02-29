import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa pide nombre y apellidos y después devuelve las iniciales.");
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Primer apellido: ");
        String apellido1 = teclado.nextLine();
        System.out.print("Segundo apellido: ");
        String apellido2 = teclado.nextLine();
    
        String iniciales = nombre.substring(0,1)+apellido1.substring(0,1)+apellido2.substring(0,1);
    
        System.out.println("Las iniciales son: " +iniciales);    
    }
}
