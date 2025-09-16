package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
}
