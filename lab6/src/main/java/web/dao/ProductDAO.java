package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
}
