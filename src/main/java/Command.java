/*ATM App
Logic to process some user input */

import java.util.List;

public interface Command {
    //Command From user e.g. deposit,withdraw
    // In Interface we have method that not implement!
    String key();
    Status handleInput(List<String> input);

    enum Status{
        INVALID,
        HANDLED
    }

}
