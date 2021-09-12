package com.wang.springbootswagger2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @version 1.0
 * @Aythor lucksoul 王吉慧
 * @date 2021/9/12 9:42
 * @description
 */
@Data
@ApiModel(description = "学生类")
public class Student {
    @ApiModelProperty("学生id")
    private Integer id;
    @ApiModelProperty("学生姓名")
    private String name;
    @ApiModelProperty("学生地址")
    private String address;
    @ApiModelProperty("学生出生日期")
    private Date birthday;
}
