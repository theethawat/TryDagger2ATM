import javax.inject.Inject;

final class LoginCommand extends SingleArgCommand {
    private final Outputter outputter;

    @Inject
    LoginCommand(Outputter outputter){
        this.outputter = outputter;
    }

    @Override
    protected Status handleArg(String arg) {
        return null;
    }

    @Override
    public String key() {
        return null;
    }
}
