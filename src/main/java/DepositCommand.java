import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

final class DepositCommand implements Command {
    /**
     * Inject is for Identifies injectable constructors, methods, and fields.
     * We don't Need to add variable as Parameter we use @Inject
     */

    private final Database database;
    private final Outputter outputter;
    @Inject
    DepositCommand(Database database,Outputter outputter){
        this.database = database;
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return null;
    }

    @Override
    public Status handleInput(List<String> input) {
        if (input.size() != 2){
            return Status.INVALID;
        }

       Database.Account account = database.getAccount(input.get(0));
        account.deposit(new BigDecimal(input.get(1)));
        outputter.output(account.username()+" Now has " + account.balance());
        return Status.HANDLED;
    }
}
