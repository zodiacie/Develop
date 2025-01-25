package com.example.demo.Controller;
import java.util.HashMap;  
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.Service.UsersService;
import com.example.demo.Feign.OpenFeign;
import com.example.demo.Pojo.Users;
import java.util.List;

@RestController  
@RequestMapping("/") 
public class Controller {
    @RequestMapping("/test")  
    public Map<String,Object> test(){  
        Map<String,Object> map=new HashMap<>();
        map.put("msg", "Successfully Visit");
        return map;
    }     

    @Autowired
    UsersService usersService;

    @CrossOrigin
    @GetMapping("/selectall")
    public List<Users> selectAll(){
        return usersService.selectAll();
    }

    @Autowired
    public OpenFeign openFeign;

    @GetMapping("/selectevery")
    public List<Users> selectEvery() {
        return openFeign.selectAll();
    }    
}