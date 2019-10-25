import javax.inject.Inject;

final class LoginCommand extends SingleArgCommand {
    private final Outputter outputter;
    private final Database database;

    @Inject
    LoginCommand(Database database,Outputter outputter){
        this.outputter = outputter;
        this.database = database;
    }

    @Override
    protected Status handleArg(String username) {
        Database.Account account = database.getAccount(username);
        outputter.output(
                username + "is logining in with balance" + account.balance()
        );
        return Status.HANDLED;
    }

    @Override
    public String key() {
        return null;
    }
}
