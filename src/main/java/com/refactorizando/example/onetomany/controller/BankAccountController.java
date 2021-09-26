package com.refactorizando.example.onetomany.controller;

import com.refactorizando.example.onetomany.domain.bidirectional.BankAccountBidirectional;
import com.refactorizando.example.onetomany.service.BankAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/banks")
public class BankAccountController {


    private final BankAccountService bankAccountService;

    @GetMapping
    public ResponseEntity<List<BankAccountBidirectional>> getBankAccounts() {

        var bankAccounts = bankAccountService.findAll();

        return new ResponseEntity<>(bankAccounts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BankAccountBidirectional> getBankAccountById(@PathVariable Long id) {

        var bankAccount = bankAccountService.findById(id);

        return new ResponseEntity<>(bankAccount, HttpStatus.OK);

    }

}