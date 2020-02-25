package com.example.saas2020.pojo;

import lombok.Data;
import org.jfaster.mango.annotation.ID;

@Data
public class SaasCancelStrategyPO {
    @ID
    private Long id;
    private String channelNo;
    private String name;
    private String ruleVal;
    private Integer status;
    private String createDate;
    private String updateDate;
    private String createUser;
    private String updateUser;
}
