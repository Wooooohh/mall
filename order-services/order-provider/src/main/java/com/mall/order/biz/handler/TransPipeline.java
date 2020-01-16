package com.mall.order.biz.handler;

import com.mall.order.biz.TransOutboundInvoker;


public interface TransPipeline extends TransOutboundInvoker {

    /**
     *
     * @param handlers
     */
    void addFirst(TransHandler... handlers);

    /**
     *
     * @param handlers
     */
    void addLast(TransHandler ... handlers);
}
