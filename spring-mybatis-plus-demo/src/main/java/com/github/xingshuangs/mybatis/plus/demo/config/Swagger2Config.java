package com.github.xingshuangs.mybatis.plus.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <一句话功能简述> <br>
 *
 * @author 邢双
 * @date 2018/9/28 11:33
 */

@Configuration
@EnableSwagger2
//@Profile({"dev"})
public class Swagger2Config {
    /**
     * swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
     *
     * @return 执行结果
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //  为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.github.xingshuangs.mybatis.plus.demo"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
     *
     * @return 执行结果
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("用户模块的所有API")
                //创建人
                .contact(new Contact("shuang", "http://www.huiborobot.com", "xingshuang_cool@163.com"))
                //版本号
                .version("1.0.0")
                //描述
                .description("")
                .build();
    }
}
