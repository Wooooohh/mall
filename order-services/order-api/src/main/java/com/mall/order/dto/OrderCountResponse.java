package com.mall.order.dto;
import com.mall.commons.result.AbstractResponse;
import lombok.Data;


@Data
public class OrderCountResponse extends AbstractResponse{

    private int count;
}
