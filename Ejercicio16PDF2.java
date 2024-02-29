import java.util.Scanner;
public class Ejercicio16PDF2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite la region en la que hace el envio (1-5)");
        System.out.println("1: América del Norte || 2: América Central || 3: América del Sur || 4: Europa || 5: Asia ");
        int region = teclado.nextInt();
        System.out.println("Digite el peso de la carga en un numero entero (Kilos)");
        int peso = teclado.nextInt();

        if (peso > 5)
        {
            System.out.println("Lo sentimos, el peso de la carga sobrepasa el limite permitido");
        }
        else if(peso < 1 )
        {
            System.out.println("Error: el peso tiene que ser un entero positivo");
        }
        else 
        {
            switch (region) {
                case 1:
                    System.out.println("El cobro de la entrega es: " + peso*24 + " euros" );
                    break;
                case 2:
                    System.out.println("El cobro de la entrega es: " + peso*20 + " euros" );
                    break;
                case 3:
                    System.out.println("El cobro de la entrega es: " + peso*21 + " euros" );
                    break;
                case 4:
                    System.out.println("El cobro de la entrega es: " + peso*10 + " euros" );
                    break;
                case 5:
                    System.out.println("El cobro de la entrega es: " + peso*18 + " euros" );
                    break;
            
                default:
                    System.out.println("Error: digito un numero que no pertenece a una region");
                    break;
            }
        }

    }
}
