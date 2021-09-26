package com.refactorizando.example.onetomany.repository.bidirectional;

import com.refactorizando.example.onetomany.domain.bidirectional.BankAccountBidirectional;
import com.refactorizando.example.onetomany.domain.bidirectional.BankBidirectional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BankAccountRepositoryTest {

    @Autowired
    private BankAccountBidirectionalRepository bankAccountRepository;

    @Autowired
    private BankBidirectionalRepository bankRepository;

    @Test
    public void when_save_new_bank_with_multiples_accounts_then_bank_is_saved_correctly() {

        BankBidirectional bankBidirectional = new BankBidirectional();
        bankBidirectional.setName("TGB");

        var bankAccount = new BankAccountBidirectional();
        bankBidirectional.addBankAccount(bankAccount);

        bankRepository.save(bankBidirectional);

    }
}
