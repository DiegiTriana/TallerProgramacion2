import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa calcula el dinero total que tenemos en euros y céntimos, contando las diferentes monedas.");
        System.out.print("Monedas de 2 euros: ");
        int dosEuros = teclado.nextInt();
        System.out.print("Monedas de 1 euro: ");
        int unEuro = teclado.nextInt();
        System.out.print ("Monedas de 50 céntimos: ");
        int cincuentaCent = teclado.nextInt();
        System.out.print ("Monedas de 20 céntimos: ");
        int veinteCent = teclado.nextInt();
        System.out.print ("Monedas de 10 céntimos: ");
        int diezCent = teclado.nextInt();
    

        int total = dosEuros * 200 + unEuro * 100 + cincuentaCent * 50 + veinteCent * 20 + diezCent * 10;
        int euros = total / 100;
        int centimos = total % 100;

        System.out.println("Se dispone de " +euros + " euros y "+centimos + " céntimos.");
    }
}
