import dagger.Component;
/**
 * So that Annotation it in CommandRouterInterface
 * tell that it link to this module
 * */

@Component (modules = HelloWorldModule.class)
public interface CommandRouterFactory
{
    CommandRouter router();

}
