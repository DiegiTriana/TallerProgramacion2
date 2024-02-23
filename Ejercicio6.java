import java.util.Scanner;

public class Ejercicio6 {
     public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Porfavor introduzca su Edad");
        int edad = teclado.nextInt();
        System.out.println("Porfavor introduzca su Nota");
        int nota = teclado.nextInt();
        System.out.println("Porfavor introduzca su genero (M o F)");
        String sexo = teclado.nextLine();
        
    }
}
