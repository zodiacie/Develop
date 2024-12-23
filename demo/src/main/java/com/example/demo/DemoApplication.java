package com.example.demo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import com.example.demo.Pojo.Users;

@EnableFeignClients(basePackages = "com.example.demo.Feign")
@EnableDiscoveryClient
@MappedTypes(Users.class)
@MapperScan("com.example.demo.Dao")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
