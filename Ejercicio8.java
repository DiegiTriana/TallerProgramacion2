import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        boolean rectangulo = false;

        System.out.println("Programa para determinar que tipo de trinagulo es dependiendo de cuanto miden sus lados");
        System.out.println("Digete lado 1");
        int lado1 = teclado.nextInt();
        System.out.println("Digete lado 2");
        int lado2 = teclado.nextInt();
        System.out.println("Digete lado 3");
        int lado3 = teclado.nextInt();

        

        if (lado1 > lado2 && lado1 > lado3) 
        {
             if ((Math.pow(lado1,2)) == (Math.pow(lado2,2)) + (Math.pow(lado3,2))) 
             {
              rectangulo = true;
             } 
          } 
          
          else if (lado2 > lado1 && lado2 > lado3) 
          {
            if ((Math.pow(lado2,2)) == (Math.pow(lado1,2)) + (Math.pow(lado3,2))) 
            {
              rectangulo = true;
            } 
          } 
          
          else if (lado3 > lado1 && lado3 > lado2) 
          {
            if ((Math.pow(lado3,2)) == (Math.pow(lado1,2)) + (Math.pow(lado2,2))) 
            {
              rectangulo = true;
            } 
          }

          if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) 
          {
            if (rectangulo) 
            {
            System.out.println("Es un triángulo rectángulo e isósceles.");
            } 
            
            else 
            {
            System.out.println("Es un triángulo isósceles.");
            }
      
            }
            
            else if (lado1 == lado2 && lado2 == lado3) 
            {
            
                if (rectangulo) {
            System.out.println("Es un triángulo rectángulo y equilátero.");
            } 
            
            else {
             System.out.println("Es un triángulo equilátero.");
            }
            }
            
            else {
            if (rectangulo) {
            System.out.println("Es un triángulo rectángulo y escaleno.");
            } else {
            System.out.println("Es un triángulo escaleno.");
            }
        } 



    }
}
