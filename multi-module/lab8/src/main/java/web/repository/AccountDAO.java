package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.model.Account;

public interface AccountDAO extends JpaRepository<Account, String> {
}
