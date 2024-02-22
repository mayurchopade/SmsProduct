package com.nt.SMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.SMS.service.SmsService;

@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/send/{toPhoneNumber}/{message}")
    public ResponseEntity<String> sendSms(  @PathVariable("toPhoneNumber") String toPhoneNumber,
            @PathVariable("message") String message) {
        smsService.sendSms(toPhoneNumber, message);
        return ResponseEntity.ok("SMS sent successfully");
    }
}
