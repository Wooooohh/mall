package com.mall.order.biz.factory;

import com.mall.order.biz.TransOutboundInvoker;


public interface TransPipelineFactory<T> {

    TransOutboundInvoker build(T obj);
}
