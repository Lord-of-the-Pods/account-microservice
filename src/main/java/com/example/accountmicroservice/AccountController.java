package com.example.accountmicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AccountController {


    Logger logger = LoggerFactory.getLogger(AccountController.class);

    private static List<User> users = new ArrayList<>();

    static{
        User user = new User() ;
        user.setFirstName("abhishek");
        user.setLastName("vishnoi");
        user.setEmail("abhishek.vishnoi@hotmail.com");
        user.setPassword("password1");
        users.add(user);

    }


    @GetMapping("/getAccountDetails")
    public AccountDetails getAccountDetails(@RequestParam String userEmail){
        logger.info("a request received to get the details for the bank account for the employees");

        AccountDetails accountDetails = new AccountDetails();
        User user = new User() ;
        user.setFirstName("abhishek");
        user.setLastName("vishnoi");
        user.setEmail(userEmail);
        user.setPassword("password1");
        accountDetails.setUser(user);
        accountDetails.setBankAccountActive(true);
        accountDetails.setBankName("State Bank of India");
        accountDetails.setAccountNumber(10005311);
        return accountDetails;
    }


}
