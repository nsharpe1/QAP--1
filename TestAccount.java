import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class TestAccount {
    
    public static void main(String[] args) {
        Account a1 = new Account(1,"Acc1",3000);

        Account a2 = new Account(2,"Acc2",4000);

        Currency currency = Currency.getInstance(Locale.CANADA);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);

        System.out.println("Account 1 balance (Before transfer):  " + currencyFormatter.format(a1.getBalance()));
        System.out.println("Account 2 balance (Before transfer):  " + currencyFormatter.format(a2.getBalance()));
        a1.transferTo(a2, 1000);
        System.out.println("Account 1 balance (After transfer):   " + currencyFormatter.format(a1.getBalance()));
        System.out.println("Account 2 balance (After transfer):   " + currencyFormatter.format(a2.getBalance()));
    }
}
