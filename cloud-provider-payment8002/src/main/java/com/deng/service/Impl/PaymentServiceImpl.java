package com.deng.service.Impl;

import com.deng.dao.PaymentMapper;
import com.deng.entities.Payment;
import com.deng.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2020/5/26.
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment bean) throws Exception {
        return paymentMapper.create(bean);
    }

    public Payment getPaymentById(Long id) throws Exception {
        return paymentMapper.getPaymentById(id);
    }
}

