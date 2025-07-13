package web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Accounts")
public class Account {

    @Id
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String photo;
    private boolean activated;
    private boolean admin;
}
