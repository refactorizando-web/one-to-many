package com.refactorizando.example.onetomany.domain.bidirectional;

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
public class BankBidirectional {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BankAccountBidirectional> bankAccounts;

    public void addBankAccount(BankAccountBidirectional bankAccount) {
        if (null == bankAccounts) {
            bankAccounts = new HashSet<>();
        }
        bankAccounts.add(bankAccount);
        bankAccount.setBank(this);
    }

    public void removeComment(BankAccountBidirectional bankAccount) {
        bankAccounts.remove(bankAccount);
        bankAccount.setBank(null);
    }
}
