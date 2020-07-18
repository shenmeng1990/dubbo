package com.alibaba.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author shenmeng
 * @Date 2020/7/19
 **/
@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = -8278395317931326669L;
    private Integer id;
    private String name;
    private int age;

}
