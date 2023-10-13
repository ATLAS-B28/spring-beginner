package com.example.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* we can make use of Spring's ResponseEntity class and the Jackson
* library for JSON serialization
* */
@RestController
public class CurrencyConfigController {
    @Autowired
    private CurrencyConfig currencyConfig;

    @GetMapping("/currency-service")//gives clarity it is get request
    public ResponseEntity<CurrencyConfig> getCurrencyConfig(){
        //uses ResponseEntity to return a JSON with help of Jackson serializable
        return ResponseEntity.ok(currencyConfig);
    }
}
