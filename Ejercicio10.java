import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digete el valor de los kilos de uvas entregados");
        double kilo = Double.parseDouble(teclado.next());
        System.out.println("Digite el valor del precio del kilo de uva");
        double precio = Double.parseDouble(teclado.next());
        System.out.println("Elija tipo de fruta (A o B)");
        char tipo = Character.toUpperCase(teclado.next().charAt(0));
        System.out.println("Elija tamaño de fruta (1 o 2)");
        byte tamaño = teclado.nextByte();

        if(tipo == 'A' && tamaño == 1)
        {
            System.out.println("El valor del total ganado es: " + (kilo*precio) + (kilo*0.20));
        }

        else if(tipo == 'A' && tamaño == 2)
        {
            System.out.println("El valor del total ganado es: " + (kilo*precio) + (kilo*0.30));
        }

        else if(tipo == 'B' && tamaño == 1)
        {
            System.out.println("El valor del total ganado es: " + ((kilo*precio) - (kilo*0.30)));
        }
        else if(tipo == 'B' && tamaño == 2)
        {
            System.out.println("El valor del total ganado es: " + ((kilo*precio) - (kilo*0.50)));
        }



    }
}
