import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Pediremos la hora segmentada, introduce la HORA: ");
    int hh = teclado.nextInt();
    System.out.println("Introduce los MINUTOS: ");
    int mm = teclado.nextInt();
    System.out.println ("Introduce los SEGUNDOS: ");
    int ss = teclado.nextInt();
    System.out.println ("Duración del viaje en segundos: ");
    int tiempo = teclado.nextInt();
    

    int totalSegundos = hh *3600 + mm *60 + ss + tiempo;
    
    hh = totalSegundos / 3600;
     int segundosRestantes = totalSegundos % 3600;
    mm = segundosRestantes / 60;
    ss = segundosRestantes % 60;
// Mostramos en pantalla
    System.out.println("La hora de llegada a la ciudad B será: "+ hh +":" + mm + ":"+ss);
}
}

