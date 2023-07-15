package spring.mybatis.Service;

import spring.mybatis.Dao.Daomysql;
import spring.mybatis.Module.Usermysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("MysqlService")
public class Servicemysql {
    @Autowired
    Daomysql daoMysql;

    public List<Usermysql> selectAll(){
        return daoMysql.selectAll();
    }
}