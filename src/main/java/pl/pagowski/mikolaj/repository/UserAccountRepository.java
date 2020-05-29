package pl.pagowski.mikolaj.repository;

import org.springframework.data.repository.CrudRepository;
import pl.pagowski.mikolaj.model.UserAccount;

import java.util.List;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
    List<UserAccount> findByEmail(String email);
}
