package com.refactorizando.example.onetomany.repository.bidirectional;

import com.refactorizando.example.onetomany.domain.bidirectional.BankBidirectional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankBidirectionalRepository extends JpaRepository<BankBidirectional, Long> {

}
