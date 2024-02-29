import java.util.Scanner;
public class Ejercicio12PDF2 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        double precio;
        double impuesto;
        String tiempodia;
        System.out.println("Digite el tiempo que duro la llamda (Usar numeros enteros)");
        int tiempo = teclado.nextInt();
        System.out.println("Que dia realizo la llamda ");
        String dia = teclado.next() ; teclado.nextLine();

        if (tiempo > 10){
            precio = 3;
        } else if (tiempo > 8){
            precio = 2.5;
        } else if (tiempo > 5){
            precio = 1.80;
        } else {
            precio = 1;
        }   
        
       
        if (!dia.toUpperCase().equals("DOMINGO")) {
          System.out.println("¿La llamada se realizó en horario de mañana o tarde? ");
          tiempodia = teclado.nextLine();
          if (tiempodia.toUpperCase().equals("MAÑANA")) {
            impuesto = precio * 0.15;
          } else if (tiempodia.toUpperCase().equals("TARDE")) {
            impuesto = precio * 0.10;
          
          } else {
            impuesto = 0; 
          }
        } else {
          impuesto = precio * 0.03;
        }
        

        if (impuesto == 0) {
          System.out.println("El horario introducido es incorrecto, reinicia el programa "
              + "e introduce los valores correctos.");
        } else {
          System.out.println("El precio total de la llamada es de " + (precio + impuesto) 
              + " siendo el precio base de " + precio + " y el impuesto a pagar " + impuesto);
        }
   











    }
}







