/**
 * Programma Java che tra tre numeri visualizza il più grande
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class NumMaggiore {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int num;
        int numMag = 0;

        // input tenendo solo il numero più grande
        for (int i = 1; i < 4; i++) {
            do {
                System.out.print("Inserire numero " + i + ": ");
                num = Integer.parseInt(input.nextLine());
            } while (num < 0);
            if (num > numMag)
                numMag = num;
        }

        // output
        System.out.println("Numero più grande: " + numMag);
        input.close();
    }
}
