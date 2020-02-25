package com.example.saas2020.pojo;

import lombok.Data;
import org.jfaster.mango.annotation.ID;

import java.math.BigDecimal;

/**
 * 计费产品
 */
@Data
public class SaasChargeProductPO {
    @ID
    private Long id;
    private String name;
    private Integer cityId;
    private Long serviceProductId;
    private Integer serviceTypeId;
    private Integer groupId;
    private String startTime;
    private String endTime;
    private Long workdayPriceId;
    private Long holidayPriceId;
    private Long waitStrategyId;
    private Long cancelStrategyId;
    private Integer otherFeeRate;
    private Integer status;
    private String createDate;
    private String createUser;
    private String updateDate;
    private String updateUser;
}
