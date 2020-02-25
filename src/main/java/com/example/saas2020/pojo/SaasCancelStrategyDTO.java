package com.example.saas2020.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class SaasCancelStrategyDTO implements Serializable {
    private static final long serialVersionUID = -3146071717123474177L;
    private Long id;
    private String name;
    private Integer status;
    private List<SaasCancelRuleDTO> ruleList;
    private String operateUser;
}
