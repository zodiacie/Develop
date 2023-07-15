package spring.mybatis.Controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Controller {
    @RequestMapping("/spring")
    public Map<String, Object> test(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Mybaits", "Successfully Running");
        return map;
    }    
}