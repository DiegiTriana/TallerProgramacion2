import java.util.Scanner;
public class ejercicio14PDF2 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Porfavor digite un numero de la semana(1-7)");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Es el dia lunes");
                break;
            case 2:
                System.out.println("Es el dia martes");
                break;
            case 3:
                System.out.println("Es el dia miercoles");
                break;
            case 4:
                System.out.println("Es el dia jueves");
                break;
            case 5:
                System.out.println("Es el dia viernes");
                break;
            case 6:
                System.out.println("Es el dia sabado");
                break;
            case 7:
                System.out.println("Es el dia doming");
                break;
        
            default:
                System.out.println("Error: digito un numero de nuevo");
                
        }






    }
}
