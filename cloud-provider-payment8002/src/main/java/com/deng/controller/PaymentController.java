package com.deng.controller;

import com.deng.entities.CommonResult;
import com.deng.entities.Payment;
import com.deng.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dengyunqing on 2020/5/27.
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) throws Exception{
        int result = paymentService.create(payment);
        log.info("*******插入结果："+result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功serverPort="+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败serverPort="+serverPort,null);
        }
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) throws Exception{
        Payment result = paymentService.getPaymentById(id);
        log.info("*******查询结果："+result);
        if(result != null){
            return new CommonResult(200,"查询成功serverPort="+serverPort,result);
        }else{
            return new CommonResult(444,"查询数据库失败serverPort="+serverPort,null);
        }
    }
}
