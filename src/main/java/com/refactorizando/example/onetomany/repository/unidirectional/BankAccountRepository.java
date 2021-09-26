package com.refactorizando.example.onetomany.repository.unidirectional;

import com.refactorizando.example.onetomany.domain.unidirectional.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

    Optional<BankAccount> findByUser(Long userId);
}
