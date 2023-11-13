/**
 * Programma Java che visualizza il cubo del numero fino a un intero dato
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class CuboNum {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int numCubi;

        // input
        do {
            System.out.print("Inserire numero cubi: ");
            numCubi = Integer.parseInt(input.nextLine());
        } while (numCubi <= 0 || numCubi > 1000);

        // output
        for (int i = 1; i < numCubi + 1; i++) {
            System.out.println("Il cubo di " + i + " equivale a " +
                               (int) Math.pow(i, 3));
        }
        input.close();
    }
}
