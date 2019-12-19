# feign-spring-boot-starter

## 简介

fegin-spring-boot-starter 基于 springBoot 和 fegin 组件，支持jdk1.7+,主要目的是将公共配置独立化，编码、解码、序列化
统一化

## 如何使用

### 1. 引入fegin-spring-boot-starter

```xml
		<dependency>
			<groupId>com.jq.boot</groupId>
			<artifactId>feign-spring-boot-starter</artifactId>
			<version>1.0.0-SNAPSHOT</version>
		</dependency>
```

### 2. 配置参数

```yaml
feign:
  logger:
    level: none, basic, headers, full （4个值选一个） 
```

### 3. 指定configuration ，如：

```java
@EnableFeignClients(defaultConfiguration=FeignConfig.class)
```

