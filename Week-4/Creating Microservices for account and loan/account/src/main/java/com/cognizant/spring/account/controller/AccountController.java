package com.cognizant.spring.account.controller;

import com.cognizant.spring.account.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Account getAccount() {

        return new Account(
                1001001,
                "Harry",
                "Savings",
                50000
        );
    }
}