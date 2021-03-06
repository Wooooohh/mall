package com.mall.pay.biz.abs;

import com.mall.commons.result.AbstractRequest;
import com.mall.commons.result.AbstractResponse;
import com.mall.commons.tool.exception.BizException;
import com.mall.pay.dto.PaymentNotifyRequest;

public interface Payment {

    /**
     * 发起交易执行的过程
     * @param request
     * @return
     * @throws BizException
     */
    <T extends AbstractResponse> T process(AbstractRequest request) throws BizException;

    /**
     * 完成交易结果的处理
     * @param request
     * @return
     * @throws BizException
     */
    <T extends AbstractResponse> T completePayment(PaymentNotifyRequest request) throws BizException;
}
