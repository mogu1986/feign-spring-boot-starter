package com.jq.boot.feign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(value = {FeignProperties.class})
@EnableConfigurationProperties(FeignProperties.class)
public class FeignAutoConfiguration {

	@Autowired
	private FeignProperties properties;

	@Bean
	@ConditionalOnMissingBean
	public FeignConfig feignConfig() {
		FeignConfig config = new FeignConfig(properties);
		return config;
	}

}