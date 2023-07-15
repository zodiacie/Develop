package demo.demo.Mapper;

import demo.demo.Pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Delete;
import java.util.List;

@Component
@Mapper
public interface UserMapper {
    //@Select("SELECT * FROM USER")
    List<User> selectAll();

    //@Select("SELECT DISTINCT * FROM USER WHERE USERNAME = #{USERNAME}")
    User select(@Param("USERNAME") String username);

    //@Delete("DELETE FROM USER WHERE USERNAME = #{USERNAME}")
    void delete(@Param("USERNAME") String username);     
    
    //@Insert("INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES (#{USERNAME}, #{EMAIL}, #{PASSWORD})")
    void insert(@Param("USERNAME") String username, @Param("EMAIL") String email, @Param("PASSWORD") String password);

    //@Update("UPDATE USER SET EMAIL = #{EMAIL} WHERE USERNAME = #{USERNAME}")
    void update(@Param("EMAIL") String email, @Param("USERNAME") String username);
}