import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Scope (scopeName = "singleton")
    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Scope (scopeName = "prototype")
    @Bean(name = "Cat")
    public Cat getCat() {
        Cat cat = new Cat();
        return cat;
    }
}