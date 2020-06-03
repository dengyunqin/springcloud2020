package com.deng.service;

import com.deng.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2020/5/26.
 */
public interface PaymentService {
    public int create (Payment bean) throws Exception;
    public Payment getPaymentById(@Param("id") Long id) throws Exception;
}
