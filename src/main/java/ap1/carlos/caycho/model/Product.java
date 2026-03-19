package ap1.carlos.caycho.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "product")
public class Product {

    @Id
    private String id;

    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String category;
    private String brand;
    private Boolean available;
    private String createdAt;
}