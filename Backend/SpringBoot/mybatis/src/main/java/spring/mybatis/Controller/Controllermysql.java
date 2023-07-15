package spring.mybatis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mybatis.Dao.Daomysql;
import spring.mybatis.Module.Usermysql;
import spring.mybatis.Service.Servicemysql;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Controllermysql {

    @Autowired
    Servicemysql service;
    
    @GetMapping("springmysqlselectall")
    public List<Usermysql> selectAll(){
        return service.selectAll();
    } 
}