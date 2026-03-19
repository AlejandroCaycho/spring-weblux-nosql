package ap1.carlos.caycho.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import ap1.carlos.caycho.model.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}