
import com.sun.xml.bind.v2.TODO;
import dagger.Component;
import javax.inject.Inject;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.jetbrains.jsonSchema.JsonPointerUtil.split;

/**
 * CommandRouter Collect Multiple Commands from [Command Interface]
 * Route input strings to them base
 * */
final class CommandRouter {


    //Multi Dependencies
    private final Map<String,Command> commands ;

    @Inject
    CommandRouter(Map<String,Command> commands){
        this.commands = commands;
    }


//    private Status invalidCommand(String input){
//        System.out.println(
//                String.format("Could not understand \"%s\" , please try again",input));
//        return Status.INVALID;
//    }
//
//    Status route(String input){
//        List<String> splitInput = split(input);
//        if(splitInput.isEmpty()){
//            return invalidCommand(input);
//        }
//
//        String commandKey = splitInput.get(0);
//        Command command = commands.get(commandKey);
//        if(command == null){
//            return  invalidCommand(input);
//        }
//
//        Status status = command.handleInput(splitInput.subList(1,splitInput.size()));
//        if(status == Status.INVALID){
//            System.out.println(commandKey + "Invalid Argrument");
//        }
//        return status;
//      }
    }


//    private static List<String> split(String string){
//
//    }

