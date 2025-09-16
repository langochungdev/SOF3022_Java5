package web.entity;
import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Categories")
public class Category implements Serializable {
    @Id
    private String id;

    private String name;

    @OneToMany(mappedBy = "category")
    List<Product> products;
}
