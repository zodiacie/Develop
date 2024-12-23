package com.example.demo.Service;

import com.example.demo.Dao.UsersDao;
import com.example.demo.Pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {
    @Autowired
    UsersDao usersDao;

    public List<Users> selectAll(){
        return usersDao.selectAll();
    }    
}
