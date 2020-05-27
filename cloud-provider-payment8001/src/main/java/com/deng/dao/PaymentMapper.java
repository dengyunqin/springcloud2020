package com.deng.dao;

import com.deng.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2020/5/26.
 */
@Mapper
public interface PaymentMapper {
    public int create (Payment payment)throws Exception;
    public Payment getPaymentById(@Param("id") Long id)throws Exception;

}
