package com.lbl.reactive.service.impl;

import com.google.common.collect.Lists;
import com.lbl.reactive.domain.Account;
import com.lbl.reactive.service.IReactorService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author: BaoLei Li
 * @date: 2021/8/18
 **/
@Service
public class ReactorServiceImpl implements IReactorService {

    @Override
    public Mono<Account> getAccountById(Long id) {
        Account account = Account.builder().id(id).accountCode("DemoCode").accountName("DemoName").build();
        return Mono.just(account);
    }

    @Override
    public Flux<Account> getAccounts() {
        List<Account> accountList = Lists
                .newArrayList(Account.builder().id(1L).accountCode("DemoCode").accountName("DemoName").build());
        return Flux.fromIterable(accountList);
    }
}
