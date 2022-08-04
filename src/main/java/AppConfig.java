//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    public AppConfig() {
    }

    @Bean(
            name = {"helloworld"}
    )
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(
            name = {"cat"}
    )
    @Scope("prototype")
    public Cat getCat() {
        return new Cat("Tom", "Meow, Meow");
    }
}
