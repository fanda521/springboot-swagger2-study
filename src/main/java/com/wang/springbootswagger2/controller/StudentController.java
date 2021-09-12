package com.wang.springbootswagger2.controller;

import com.wang.springbootswagger2.entity.Student;
import com.wang.springbootswagger2.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @version 1.0
 * @Aythor lucksoul 王吉慧
 * @date 2021/9/12 9:43
 * @description
 */
@RestController
@Api(description = "学生controller",tags = {"学生管理接口","学生" },basePath = "/student")
@RequestMapping("/student")
public class StudentController {
    @PostMapping("/addStudent")
    @ApiOperation("添加学生的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "学生名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "学生地址", defaultValue = "深圳", required = true)
    }
    )
    public ResponseResult addStudent(String username, @RequestParam(required = true) String address) {
        Student student = new Student();
        student.setName(username);
        student.setAddress(address);
        student.setBirthday(new Date());
        student.setId(1);
        return ResponseResult.ok(student);
    }

    @GetMapping("/getStudentById/{id}")
    @ApiOperation("根据id查询学生的接口")
    @ApiImplicitParam(name = "id", value = "学生id", defaultValue = "99", required = true)
    public ResponseResult getStudentById(@PathVariable Integer id) {
        Student student = new Student();
        student.setId(id);
        return ResponseResult.ok(student);
    }
    @PutMapping("/updateStudentById")
    @ApiOperation("根据id更新学生的接口")
    @ApiImplicitParam(name = "student",type = "com.wang.springbootswagger2.entity.Student",
            required = true,value = "学生实体apiModel",example = "\t\n" +
            "{\n" +
            "\"id\":\"2\",\n" +
            "\"name\":\"jeffrey\",\n" +
            "\"address\":\"江西南昌\",\n" +
            "“birthday\":\"1996-05-30”\n" +
            "\n" +
            "}")
    public ResponseResult updateStudentById(@RequestBody Student student) {
        return ResponseResult.ok(student);
    }

}
