package com.refactorizando.example.onetomany.service;

import com.refactorizando.example.onetomany.domain.bidirectional.BankAccountBidirectional;
import com.refactorizando.example.onetomany.repository.bidirectional.BankAccountBidirectionalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BankAccountService {

    private final BankAccountBidirectionalRepository bankAccountRepository;

    public BankAccountBidirectional findById(Long id) {

        return bankAccountRepository.findById(id).orElseThrow();

    }

    public List<BankAccountBidirectional> findAll() {

        return bankAccountRepository.findAll();
    }
}