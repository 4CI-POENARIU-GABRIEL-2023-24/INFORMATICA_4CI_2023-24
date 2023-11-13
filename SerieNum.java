/**
 * Programma Java che legge dei numeri interi e,
 * se si inserisce un numero positivo seguito da un numero negativo,
 * visualizza una conferma ed esce dal programma
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class SerieNum {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int num;
        boolean numEraPositivo = false;
        boolean continuaAdInserire = true;

        // input e controlli
        while (continuaAdInserire) {
            System.out.print("Inserire numero: ");
            num = Integer.parseInt(input.nextLine());
            if (numEraPositivo) if (num < 0) continuaAdInserire = false;
            if (num > 0) numEraPositivo = true;
            else numEraPositivo = false;
        }
        input.close();
    }
}
