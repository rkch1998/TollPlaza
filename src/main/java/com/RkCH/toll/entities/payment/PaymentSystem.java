package com.RkCH.toll.entities.payment;

import com.RkCH.toll.enums.PaymentMethod;

public interface PaymentSystem {
    PaymentMethod getType();
    String getAccountInfo();
}
