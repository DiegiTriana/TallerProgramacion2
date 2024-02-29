import java.util.Scanner;
public class Ejercicio7PDF2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Porfavor digite el valor que tiene x1 en la primera circunferencia");
        float x1 = Float.parseFloat(teclado.next());
        System.out.println("Porfavor digite el valor que tiene y1 en la primera circunferencia");
        float y1 =  Float.parseFloat(teclado.next());
        System.out.println("Porfavor digite el valor del radio en la primera circunferencia");
        float r =  Float.parseFloat(teclado.next());
        System.out.println("Porfavor digite el valor que tiene x2 en la segunda circunferencia");
        float x2 =  Float.parseFloat(teclado.next());
        System.out.println("Porfavor digite el valor que tiene y2 en la segunda circunferencia");
        float y2 =  Float.parseFloat(teclado.next());
        System.out.println("Porfavor digite el valor del radio en la segunda circunferencia");
        float r2 =  Float.parseFloat(teclado.next());

        double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        if (distancia == 0) {
            System.out.println("El tipo de cincurferencia es concéntrica.");
          } else if (distancia > (r+r2)) {
            System.out.println("El tipo de cincurferencia es exterior.");
          } else if ((distancia > 0) && distancia < Math.abs(r-r2)) {
            System.out.println("El tipo de cincurferencia es interior.");
          } else if (distancia == (r+r2)) {
            System.out.println("El tipo de cincurferencia es tangente exterior.");
          } else if (distancia == Math.abs(r-r2)) {
            System.out.println("El tipo de cincurferencia es tangentes interior.");
          } else if (distancia < (r+r2) && distancia > Math.abs(r-r2)) {
            System.out.println("El tipo de cincurferencia es Secante.");
          }


    }
}
