package pl.pagowski.mikolaj.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String email;
    private String userName;
    private String userSurname;
    private Integer age;
    private BigDecimal balance;
    private LocalDateTime dateTime;
    @OneToOne(mappedBy = "userAccount")
    private Car car;

    public UserAccount() {
    }

    public UserAccount(Long id, String email, String userName, String userSurname, Integer age, BigDecimal balance, LocalDateTime dateTime) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.userSurname = userSurname;
        this.age = age;
        this.balance = balance;
        this.dateTime = dateTime;
    }
}
