package demo.demo.Service;

import demo.demo.Mapper.UserMapper;
import demo.demo.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("MysqlService")
public class MysqlService {
    
    @Autowired
    UserMapper userMapper;

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public User select(String username){
        return userMapper.select(username);
    }

    public void delete(String username){
        userMapper.delete(username);
    }

    public void insert(User user){
        if (user != null){
            System.out.println(user.getName()+user.getEmail()+user.getPassword());
        }
        userMapper.insert(user.getName(), user.getPassword(), user.getEmail());
    }

    public void update(User user){
        if (user != null){
            System.out.println(user.getName()+user.getEmail());
        }
        userMapper.update(user.getEmail(), user.getName());
    }

    /*public int insertupdate(User user){
        String username = user.getName();
        User currentUser = userMapper.select(username);
        if(currentUser != null){
            return userMapper.update(user);
        }            
        return userMapper.insert(user);
    }*/
}