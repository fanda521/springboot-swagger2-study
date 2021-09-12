package com.wang.springbootswagger2.config;

import com.google.common.base.Predicates;
import com.wang.springbootswagger2.anno.StudentAnno;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version 1.0
 * @Aythor lucksoul 王吉慧
 * @date 2021/9/12 9:44
 * @description
 */
@Configuration
@EnableSwagger2
public class DocketConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                /*.apis(
                        Predicates.and(
                                RequestHandlerSelectors.withMethodAnnotation(StudentAnno.class)
                        )
                )*///方法上有自定义的注解才生成api文档
                .apis(RequestHandlerSelectors.basePackage("com.wang.springbootswagger2"))
                //.paths(PathSelectors.any())
                .paths(
                        Predicates.or(
                                PathSelectors.regex("/student/get.*"),
                                PathSelectors.regex("/student/add.*")
                        )
                )
                .build().apiInfo(new ApiInfoBuilder()
                        .title("SpringBoot整合Swagger")
                        .description("SpringBoot整合Swagger，详细信息......")
                        .version("9.0")
                        .contact(new Contact("啊啊啊啊","blog.csdn.net","aaa@gmail.com"))
                        .license("The Apache License")
                        .licenseUrl("http://www.baidu.com")
                        .build());
    }

}
