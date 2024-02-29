import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor digite la distancia en km que se encuentra separado los autos");
        double dis = teclado.nextDouble();
        System.out.println("Porfavor digite la velocuidad en Km/h del vehiculo mas rapido que es el que va por atras");
        double v2 = teclado.nextDouble();
        System.out.println("Porfavor digite la velocuidad en Km/h del vehiculo que va por al frente");
        double v1 = teclado.nextDouble();

        double difv = v2 - v1;
        double tiempo = dis / (difv);
        tiempo = tiempo * 60;

        System.out.println("Ambos vehículos van a coincidir una vez pasado " + (int)tiempo + " minutos.");
    }
}
