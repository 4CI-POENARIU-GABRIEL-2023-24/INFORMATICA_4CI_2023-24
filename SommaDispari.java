/**
 * Programma Java che visualizza un numero dato di numeri dispari
 * e la loro somma
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class SommaDispari {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int numDispari;
        int somma = 0;

        // input
        do {
            System.out.print("Inserire numero valori dispari: ");
            numDispari = Integer.parseInt(input.nextLine());
        } while (numDispari <= 0 || numDispari > 1000);

        // output
        System.out.println("I numeri dispari sono:");
        for (int i = 1; i < numDispari * 2 + 1; i += 2) {
            System.out.println(i);
            somma += i;
        }
        System.out.println("La loro somma equivale a " + somma);
        input.close();
    }
}
