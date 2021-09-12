package com.wang.springbootswagger2.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @Aythor lucksoul 王吉慧
 * @date 2021/9/12 10:00
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {
    private String code;
    private String msg;
    private Object data;

    public static ResponseResult ok(Object data){
        ResponseResult result = new ResponseResult();
        result.setCode("000");
        result.setMsg("success");
        result.setData(data);
        return result;
    };
}
