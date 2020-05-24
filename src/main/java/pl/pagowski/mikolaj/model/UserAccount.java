package pl.pagowski.mikolaj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

}
