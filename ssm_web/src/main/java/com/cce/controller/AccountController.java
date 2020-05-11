package com.cce.controller;

import com.cce.pojo.Account;
import com.cce.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("controller");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/saveAccount",method = RequestMethod.POST)
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.printf(account.getName());
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

    /*@RequestMapping("/saveAccount")
    public String saveAccount( Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("save");
        accountService.saveAccount(account);
        *//*response.sendRedirect(request.getContextPath()+"/account/findAll");*//*
        return "redirect:/account/findAll";
    }*/
}
