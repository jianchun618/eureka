package com.sxyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :
 * @param :Eureka 服务的源代码 --正常工作数可自动，剔除失效节点功能
 *         用于服务的发布（需打包运行Eureka）
 *         -- SpringBoot服务的治理方案。
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
