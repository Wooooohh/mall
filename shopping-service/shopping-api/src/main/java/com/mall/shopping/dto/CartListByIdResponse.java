package com.mall.shopping.dto;

import com.mall.commons.result.AbstractResponse;
import lombok.Data;

import java.util.List;

@Data
public class CartListByIdResponse extends AbstractResponse {

    private List<CartProductDto> cartProductDtos;
}
