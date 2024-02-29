import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Este programa calcula la nota final de un alumno considerando que cada respuesta correcta suma 5 puntos, cada incorrecta resta un punto, y las no contestadas no se valoran.");
        System.out.print("Total de preguntas correctas: ");
        int correctas = teclado.nextInt();
        System.out.print("Total de preguntas incorrectas: ");
        int incorrectas = teclado.nextInt();
        System.out.print ("Total de preguntas no contestadas: ");
        int noContestadas = teclado.nextInt();
    

        int notaMaxima = (correctas + incorrectas + noContestadas) * 5;
        int notaFinal = (correctas*5) + (incorrectas*(-1));

        double notaSobre10 = (double)(notaFinal*10) / notaMaxima;
    

        System.out.printf("La nota final es de: " + notaFinal + ", que se corresponde con un %5.2f sobre 10", notaSobre10);






    }
}
