package com.refactorizando.example.onetomany.repository.bidirectional;

import com.refactorizando.example.onetomany.domain.unidirectional.Bank;
import com.refactorizando.example.onetomany.domain.unidirectional.BankAccount;
import com.refactorizando.example.onetomany.repository.unidirectional.BankRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BankRepositoryTest {

    @Autowired
    private BankRepository bankRepository;

    @Test
    public void when_save_new_bank_with_multiples_accounts_then_bank_is_saved_correctly() {

        Bank bank = new Bank();
        bank.setName("TGB");

        var bankAccount = new BankAccount();
        bankAccount.setUser(2L);

        bank.getBankAccounts().add(bankAccount);

        bankRepository.save(bank);
    }
}
