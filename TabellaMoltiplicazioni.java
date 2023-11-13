/**
 * Programma Java che visualizza la tabella di moltiplicazione di un numero
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class TabellaMoltiplicazioni {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int num;
        int numMoltiplicazioni;

        // input
        do {
            System.out.print("Inserire numero: ");
            num = Integer.parseInt(input.nextLine());
        } while (num <= 0 || num > 1000);
        do {
            System.out.print("Inserire numero moltiplicazioni: ");
            numMoltiplicazioni = Integer.parseInt(input.nextLine());
        } while (numMoltiplicazioni <= 0 || numMoltiplicazioni > 100);

        // output
        for (int i = 0; i < numMoltiplicazioni + 1; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
        input.close();
    }
}
