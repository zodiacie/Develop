package demo.demo.Controller;

import demo.demo.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import demo.demo.Service.MysqlService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MysqlController {

    @Autowired
    MysqlService service;
    
    @GetMapping("springmysqlselectall")
    public List<User> selectAll(){
        return service.selectAll();
    } 
    
    @GetMapping("springmysqlselect")
    public User select(@RequestParam String username){
        return service.select(username);
    }

    @GetMapping("springmysqldelete")
    public void delete(@RequestParam String username){
        service.delete(username);
    }

    @CrossOrigin
    @PostMapping("springmysqlinsert")
    public void insert(@RequestBody Map<String, Object> map){
        String username = map.get("username").toString();
        String password = map.get("password").toString();
        String email = map.get("email").toString();
        if (username != null || password != null || email != null){
            System.out.println(username + password + email);
        }
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        user.setEmail(email);
        if (user != null){
            System.out.println(user);
        }
        service.insert(user);
    }

    @CrossOrigin
    @PostMapping("springmysqlupdate")
    public void update(@RequestBody Map<String, Object> map){
        String username = map.get("username").toString();
        String email = map.get("email").toString();
        User user = new User();
        user.setName(username);
        user.setEmail(email);
        service.update(user);
    }

    /*@PostMapping("springmysqlinsertupdate")
    public boolean insertupdate(@RequestParam String username, String password, String email){
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        user.setEmail(email);
        return service.insertupdate(user);
    }*/   
}