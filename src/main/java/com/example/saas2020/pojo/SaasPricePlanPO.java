package com.example.saas2020.pojo;

import lombok.Data;
import org.jfaster.mango.annotation.ID;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
public class SaasPricePlanPO implements Serializable {
    private static final long serialVersionUID = -5133516522201126590L;
    @ID
    private Integer id;
    private BigDecimal basePrice;
    private Integer includeMinute;
    private Integer includeMileage;
    private BigDecimal durationPrice;
    private BigDecimal mileagePrice;
    private String durationVal;
    private String mileageVal;
    private String distanceVal;
    private Integer durationStrategy;
    private Integer mileStrategy;
    private Integer driverId;
    private String createDate;
    private String createUser;
    private String updateDate;
    private String updateUser;
}
