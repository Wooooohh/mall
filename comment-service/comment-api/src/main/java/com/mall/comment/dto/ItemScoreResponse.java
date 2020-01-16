package com.mall.comment.dto;

import com.mall.commons.result.AbstractResponse;
import lombok.Data;

/**
 * 根据评价计算商品综合评分返回结果
 */
@Data
public class ItemScoreResponse extends AbstractResponse {

    /**
     * 综合评分
     */
    private double score;
}
