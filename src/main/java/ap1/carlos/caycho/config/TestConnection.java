package ap1.carlos.caycho.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@Configuration
@RequiredArgsConstructor
public class TestConnection implements CommandLineRunner {

    private final ReactiveMongoTemplate mongoTemplate;

    @Override
    public void run(String... args) {

        System.out.println("Probando conexión a MongoDB...");

        mongoTemplate.getCollectionNames()
                .doOnNext(name -> System.out.println("Collection: " + name))
                .doOnComplete(() -> System.out.println("Conectado correctamente a MongoDB"))
                .doOnError(error -> System.out.println("Error: " + error.getMessage()))
                .subscribe();
    }
}