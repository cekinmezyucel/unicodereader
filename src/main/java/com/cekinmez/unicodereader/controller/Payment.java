package com.cekinmez.unicodereader.controller;

import com.cekinmez.unicodereader.model.RequestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class Payment {

    @PostMapping
    public void saveUser(@RequestBody RequestModel requestModel) {
        System.out.println(requestModel.toString());
    }

}
