package com.deng.controller;

import com.deng.entities.CommonResult;
import com.deng.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dengyunqing on 2020/5/27.
 */
@RestController
public class OrderController {
    public static final String payment_url ="192.168.1.74:8001/payment";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult creater(Payment payment) throws Exception{
        return  restTemplate.postForObject(payment_url+"/create",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) throws Exception{
        return restTemplate.getForObject(payment_url+"/payment/get/"+id,CommonResult.class);
    }
}
