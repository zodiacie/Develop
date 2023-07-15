package demo.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import demo.demo.Pojo.UserMongo;
import java.util.List;

@RestController
public class MongodbController {

    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping("/springmongoretrieve")
    public List<UserMongo> find(){
        return mongoTemplate.findAll(UserMongo.class);
    }
}