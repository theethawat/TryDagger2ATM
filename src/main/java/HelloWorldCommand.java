import javax.inject.Inject;
import java.util.List;

final class HelloWorldCommand implements Command {

    //TODO(Remove null default value)
    private final Outputter outputter = null;

    @Inject
    HelloWorldCommand(Outputter outputter) {}

    @Override
    public String key() {
        return "Hello";
    }

    @Override
    public Status handleInput(List<String> input) {
        if(!input.isEmpty()){
            return Status.INVALID;
        }
        outputter.output("world!");
        return Status.HANDLED;
    }
}
