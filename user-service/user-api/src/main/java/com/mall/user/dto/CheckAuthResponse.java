package com.mall.user.dto;

import com.mall.commons.result.AbstractResponse;
import lombok.Data;

@Data
public class CheckAuthResponse extends AbstractResponse {

    private String userinfo;
}
