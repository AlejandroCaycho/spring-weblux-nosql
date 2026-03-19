package ap1.carlos.caycho.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "category")
public class Category {

    @Id
    private String id;

    private String name;
    private String description;
    private String status;
    private String createdAt;
}