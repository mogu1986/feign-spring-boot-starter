package com.jq.boot.feign;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * @Auther: Jim
 * @Date: 2018/03/07 13: 46
 * @Description: Feign参数
 */

@ConfigurationProperties(prefix = "feign.logger")
public class FeignProperties {

    /**
     * 日志级别
     */
    private String level = "none";//设定日志默认级别

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}