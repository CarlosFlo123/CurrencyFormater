import java.util.*;
import java.text.*;

public class CurrencyFormater {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us, india, china, france, peru;
        NumberFormat nfUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIn = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat nfFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat nfCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfPe = NumberFormat.getCurrencyInstance(new Locale("es", "pe"));


        nfUs.setMaximumFractionDigits(2);
        nfIn.setMaximumFractionDigits(2);
        nfCh.setMaximumFractionDigits(2);
        nfFr.setMaximumFractionDigits(2);
        

        us = (nfUs.format(payment));
        india = (nfIn.format(payment));
        china = (nfCh.format(payment));
        france = (nfFr.format(payment));
        peru = (nfPe.format(payment));

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        System.out.println("Peru: " + peru);

    }
}


