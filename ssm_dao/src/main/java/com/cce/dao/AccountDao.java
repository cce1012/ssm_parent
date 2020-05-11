package com.cce.dao;

import com.cce.pojo.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Select("insert into account (name)values(#{name})")
    void saveAccount(Account account);
}
