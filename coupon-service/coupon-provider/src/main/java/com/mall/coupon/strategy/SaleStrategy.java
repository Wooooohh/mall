package com.mall.coupon.strategy;

import com.mall.coupon.dto.UseCouponRequest;

public abstract class SaleStrategy {
    public abstract boolean match(UseCouponRequest request);
    public abstract void perform();
}
