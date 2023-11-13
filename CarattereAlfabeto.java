/**
 * Programma Java che visualizza se il carattere dato è
 * una vocale o una consonante
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class CarattereAlfabeto {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        String carattere;
        boolean carattereInAlfabeto = false;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // input
        System.out.print("Inserire carattere: ");
        carattere = input.nextLine();

        // controllo carattere
        for (int i = 0; i < alfabeto.length(); i++) {
            if (carattere.toUpperCase().equals(alfabeto.charAt(i) + ""))
                carattereInAlfabeto = true;
        }

        // output
        if (carattereInAlfabeto) {
            switch(carattere.toUpperCase().charAt(0)) {
                case 'A', 'E', 'I', 'O', 'U':
                    System.out.print("La lettera è una vocale"); break;
                default:
                    System.out.print("La lettera è una consonante");
            }
        }
        else System.out.print("Errore!");
        input.close();
    }
}
