package web.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Orderdetails")
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "Productid")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "Orderid")
    private Order order;
}
