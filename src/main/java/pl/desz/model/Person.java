package pl.desz.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    private LocalDateTime creationDate = LocalDateTime.now();
}
