package com.refactorizando.example.onetomany.domain.unidirectional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue
    private Long id;

    private Long user;

    private BigDecimal amount;

}
