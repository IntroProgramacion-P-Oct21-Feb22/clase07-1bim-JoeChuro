/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package manejosswitch;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese en que ciudad vive");
        String cadena = entrada.nextLine();
        
        switch(cadena){
            case "Quito":
            case "QUITO";
            case "quito";
            
                System.out.println("Bienvenido a las artes vivas");
                break;  
            
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        
    }
}
