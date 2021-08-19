package com.lbl.reactive.controller;

import com.lbl.reactive.domain.Account;
import com.lbl.reactive.service.IReactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author: BaoLei Li
 * @date: 2021/8/18
 **/
@RestController
@RequestMapping("/api")
public class ReactorController {

    @Autowired
    private IReactorService reactorService;

    @GetMapping("/accounts")
    public Flux<Account> getAccountList() {
        return reactorService.getAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Mono<Account> getAccountById(@PathVariable Long id) {
        return reactorService.getAccountById(id);
    }
}
