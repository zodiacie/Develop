package com.example.demo.Dao;

import com.example.demo.Pojo.Users;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Mapper
public interface UsersDao {
    //@Select("SELECT * FROM USERS")
    List<Users> selectAll();    
}
