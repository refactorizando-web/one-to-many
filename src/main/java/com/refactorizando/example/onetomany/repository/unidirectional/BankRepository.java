package com.refactorizando.example.onetomany.repository.unidirectional;

import com.refactorizando.example.onetomany.domain.unidirectional.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
