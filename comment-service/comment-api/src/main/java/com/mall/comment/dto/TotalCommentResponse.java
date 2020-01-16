package com.mall.comment.dto;

import com.mall.commons.result.AbstractResponse;
import lombok.Data;

@Data
public class TotalCommentResponse extends AbstractResponse {

    private long total;
}
