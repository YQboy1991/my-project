package com.lbl.reactive.service;

import com.lbl.reactive.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author: BaoLei Li
 * @date: 2021/8/18
 **/
public interface IReactorService {

    Mono<Account> getAccountById(Long id);

    Flux<Account> getAccounts();
}
