package com.cce.service;

import com.cce.pojo.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
