package com.gponder.springbootcomponent.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/7/27 15:45
 */
@ConfigurationProperties(prefix = "ponder.autoconfig")
public class MyConfigurationProperties {

    private String dbType;

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }
}
