import dagger.Component;
import dagger.internal.DaggerCollections;

import java.util.Scanner;
public class CommandLineAtm
{
    @Component(modules = {HelloWorldModule.class,SystemOutModule.class})
    interface CommandRouterFactory{
        CommandRouter router();
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        CommandRouterFactory commandRouterFactory = DaggerCommandRouterFactory.create();
        CommandRouter commandRouter = commandRouterFactory.router();

        while(scanner.hasNextLine()){
            commandRouter.route(scanner.nextLine());
        }
    }
}