package com.refactorizando.example.onetomany.domain.bidirectional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class BankAccountBidirectional {

    @Id
    @GeneratedValue
    private Long id;

    private Long user;

    private BigDecimal amount;

    @ManyToOne
    private BankBidirectional bank;

}
