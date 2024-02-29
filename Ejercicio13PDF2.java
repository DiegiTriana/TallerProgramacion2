import java.util.Scanner;
public class Ejercicio13PDF2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor digite el numero del resultado de la cara del dado al tirarla");
        int dado = teclado.nextInt();

        switch (dado) {
            case 1:
                System.out.println("La cara opuesta es: seis." );
                break;
            case 2:
                System.out.println("La cara opuesta es: cinco." );
                break;
            case 3:
                System.out.println("La cara opuesta es: cuatro." );
                break;
            case 4:
                System.out.println("La cara opuesta es: tres." );
                break;
            case 5:
                System.out.println("La cara opuesta es: dos." );
                break;
            case 6:
                System.out.println("La cara opuesta es: uno." );
                break;
            default:
                System.out.println("ERROR: numero incorrecto");
        }




    }
}
