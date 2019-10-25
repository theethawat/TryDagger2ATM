import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
abstract class HelloWorldModule {
    //Tell Dagger when something depend on Command Dagger should provide Hello World Command
    //Because of Command is an interface cannot inject itself

    @Binds
    @IntoMap
    @StringKey("hello")
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
