package com.refactorizando.example.onetomany.repository.bidirectional;

import com.refactorizando.example.onetomany.domain.bidirectional.BankAccountBidirectional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountBidirectionalRepository extends JpaRepository<BankAccountBidirectional, Long> {

    Optional<BankAccountBidirectional> findByUser(Long userId);
}
