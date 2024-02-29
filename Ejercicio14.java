import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Porfavor digite un numero de dos cifras");
        int numero = teclado.nextInt();

        int di = numero / 10;
        int di2 = numero % 10;
        int inverso = di2 *10 + di;

        System.out.println("El numero invertido es: " + inverso);

    }
}
