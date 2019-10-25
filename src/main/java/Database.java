
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, Account> accounts = new HashMap<>();

    @Inject
    Database(){}

    Account getAccount(String username){
        return accounts.computeIfAbsent(username,Account::new);
    }

    //Like Data class inside class
    static final class Account{
        private final String username;
        private BigDecimal balance = BigDecimal.ZERO;

        //Using Constructor

        Account (String username){
             this.username = username;
        }

        String username(){
            return username;
        }

        BigDecimal balance(){
            return balance;
        }


    }
}
