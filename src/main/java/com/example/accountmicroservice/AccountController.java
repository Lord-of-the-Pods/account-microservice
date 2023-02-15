package com.example.accountmicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AccountController {


    Logger logger = LoggerFactory.getLogger(AccountController.class);

    private static HashMap<String , AccountDetails> accountDetailsMap = new HashMap<>();

    static{
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setUserEmail("abhishek.vishnoi@hotmail.com");
        accountDetails.setBankAccountActive(true);
        accountDetails.setBankName("State Bank of India");
        accountDetails.setAccountNumber(10005311);

        AccountDetails accountDetails1 = new AccountDetails();
        accountDetails1.setUserEmail("arushi.goyal@hotmail.com");
        accountDetails1.setBankAccountActive(true);
        accountDetails1.setBankName("ICICI");
        accountDetails1.setAccountNumber(1005626);

        accountDetailsMap.put("abhishek.vishnoi@hotmail.com" , accountDetails);
        accountDetailsMap.put("arushi.goyal@hotmail.com" , accountDetails1);

    }


    @GetMapping("/getAccountDetails/{userEmail}")
    public AccountDetails getAccountDetails(@RequestParam String userEmail){
        logger.info("a request received to get the details for the bank account for the employee");
        return accountDetailsMap.get(userEmail);
    }

    @GetMapping("/getAccountDetails")
    public List<AccountDetails> getAccountDetails(){
        logger.info("a request received to get the details for the bank account for the employee");
        return accountDetailsMap.values().stream().collect(Collectors.toList());
    }


    @PostMapping("/addAccount")
    public void addAccount(@RequestParam AccountDetails accountDetails) {
        logger.info("a request received to add the details for the bank account for the employee");
         accountDetailsMap.put(accountDetails.getUserEmail() , accountDetails);
    }

}
