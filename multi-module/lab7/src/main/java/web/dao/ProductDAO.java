package web.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import web.entity.Product;
import web.model.Report;

public interface ProductDAO extends JpaRepository<Product, Integer> {

    // Bài 1 - Tìm theo khoảng giá (JPQL)
    @Query("FROM Product o WHERE o.price BETWEEN ?1 AND ?2")
    List<Product> findByPrice(double min, double max);

    // Bài 2 - Tìm theo từ khóa có phân trang (JPQL)
    @Query("FROM Product o WHERE o.name LIKE ?1")
    Page<Product> findByKeywords(String keyword, Pageable pageable);

    // Bài 3 - Thống kê tồn kho theo loại hàng
    @Query("SELECT o.category AS group, SUM(o.price) AS sum, COUNT(o) AS count "
         + "FROM Product o GROUP BY o.category ORDER BY SUM(o.price) DESC")
    List<Report> getInventoryByCategory();

    // Bài 4 - DSL thay thế findByPrice
    List<Product> findByPriceBetween(double min, double max);

    // Bài 5 - DSL thay thế findByKeywords
    Page<Product> findAllByNameLike(String keyword, Pageable pageable);
}
