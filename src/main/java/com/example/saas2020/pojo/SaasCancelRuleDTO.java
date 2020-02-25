package com.example.saas2020.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class SaasCancelRuleDTO implements Serializable {
    private static final long serialVersionUID = -3146071717123474177L;
    private Integer index;
    List<TravelTimeDTO> travelTimeList;
    /**
     * 1-固定金额
     * 2-预估金额比例
     */
    private Integer type;
    private BigDecimal passengerPrice;
    private BigDecimal driverPrice;

    private BigDecimal passengerRate;
    private BigDecimal passengerPriceMax;
    private BigDecimal driverRate;
    private BigDecimal driverPriceMax;
}
