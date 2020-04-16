package com.gponder.springbootcomponent.autoconfig;

import org.apache.catalina.startup.Tomcat;
import org.apache.coyote.UpgradeProtocol;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * @Author gponder
 * @Email gponder.g@gmail.com
 * @create 2020/3/26 16:04
 *
 * 1 先做一个出来看看效果
 *      a. 加注释
 */
@Configuration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
public class MyAutoConfiguration {

    @Bean
    @ConditionalOnClass({Tomcat.class, UpgradeProtocol.class})
    public void addMyConfig(){
          System.out.println("MyAutoConfiguration");
    }

}
