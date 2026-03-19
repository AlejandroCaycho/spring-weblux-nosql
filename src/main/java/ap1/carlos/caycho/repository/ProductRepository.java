package ap1.carlos.caycho.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import ap1.carlos.caycho.model.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}