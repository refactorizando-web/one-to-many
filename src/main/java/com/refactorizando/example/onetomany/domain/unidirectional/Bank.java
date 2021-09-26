package com.refactorizando.example.onetomany.domain.unidirectional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue

    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "bank_id")
    private Set<BankAccount> bankAccounts = new HashSet<>();

}
