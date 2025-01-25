package com.example.demo.Feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Pojo.Users;

@FeignClient(name = "demo02")
public interface OpenFeign {
    @GetMapping("/selecteveryrecord")
    public List<Users> selectAll();
}
