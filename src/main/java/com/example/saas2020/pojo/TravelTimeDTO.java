package com.example.saas2020.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class TravelTimeDTO implements Serializable {
    private static final long serialVersionUID = 1462641276834058975L;
    private Integer id;
    private Integer travelTime;
}
