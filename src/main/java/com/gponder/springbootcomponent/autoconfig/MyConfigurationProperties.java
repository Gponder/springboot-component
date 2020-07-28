package com.gponder.springbootcomponent.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/7/27 15:45
 *
 * 配置提示
 * https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/appendix-configuration-metadata.html
 * additional 中配置无法识别时添加description标签即可识别
 */
@Data
@Component
@ConfigurationProperties(prefix = "ponder.autoconfig")
public class MyConfigurationProperties {

    private String dbType;
    private String name;

    class Conn {

    }
}
