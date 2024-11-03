目录:  
[JDK Setup](#jdksetup)  
[SpringBoot](#springboot)  
[MySQL Setup](#mysql)  
[MongoDB Setup](#mongo)  
[ReactJS](#reactjs)  

<a name = "jdksetup">JDK Setup</a>  
1) Remove JDK: sudo apt-get purge (JDK name: openjdk-11-jre:amd64)  
2) Check JDK list: sudo dpkg --list | grep -i jdk  
3) Install JDK: sudo apt install openjdk-17-jdk  

<a name = "springboot">SpringBoot Setup</a>  
1) VSCode 里安装Java Extension Pack和Spring Boot Extension Pack - Following code suitable for Spring 2.7.18 and myBatis 1.3.2
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/12e9793f-f80b-45ca-ac89-f2ed3f1beab6)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/fd59fba5-49c3-402d-be36-268853a4ca2b)
2) 按Ctrl+Shift+P 并输入”Spring” 按照提示，选择“Spring Initializr:Create a Maven Project...”
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/825536b3-85ff-4c6b-a520-e4f42c53bcf6)
3) 选择springboot版本: 2.4.2 或者提示的版本
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/90d7e286-e3e8-45a7-891a-06a28b3dd226)
4) 选择语言：java
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/fc077ffe-4785-46db-88fc-b4f403f2bdfd)
5) 设置组id：com.example
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/04b71cd0-1d64-4a3c-aef5-effbb4e75f82)
6) 设置项目名：demo
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/55f379af-a467-47b2-bc09-d6cca7db29a1)
7) 选择打包类型：jar
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/78082f26-7252-4640-a339-9cf60bb670bc)
8) 选择jdk版本：8  
9) 选择项目依赖：多选 Lombok, Spring Web Web, Spring Boot DevTools, Thymeleaf.
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/6ee72950-45e0-4954-86a6-ea3631bcf1a3)
   回车后，将会让你选择目录，此时选择你之前创建的目录，如果之前没创建也不打紧，  
   点击文件列表的空白右键创建即可, 此时我们选择项目目录。 
   点击Generate into this folder，如果文件夹已有项目，则会询问你覆盖还是重选一个文件夹，
   如果没有项目，则提示创建成功，问你是打开，还是添加到编辑器。
   如果选择打开，则会使用新窗口打开，如果选择添加，则会在当前窗口打开
   此时你的一个demo项目就创建好了！
   项目运行, 上面创建的项目肯定是不能直接运行的，为什么？
   那是因为它只是一个demo，正常情况下你需要一个控制层，来处理请求.
   根据你的业务需要，你需要完善你的项目。
   在这里我就添加一个controller，并且运行作为演示：
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/70dab6bf-47ef-4523-8f26-810c802cc45c)
   ```
   package com.example.demo.controller;  
   import java.util.HashMap;  
   import java.util.Map;  
   import org.springframework.web.bind.annotation.RequestMapping;  
   import org.springframework.web.bind.annotation.RestController;  
   @RestController  
   @RequestMapping("/admin")  
   public class Controller {    
     @RequestMapping("/test")  
     public Map<String,Object> test(){  
       Map<String,Object> map=new HashMap<>();
       map.put("msg", "访问成功！");
       return map;
     }
   }
   ```
   设置的请求路径为："/admin/test"  
   不要忘记了配置端口信息：在resource目录下有一个application.properties文件(使用yml的话，将后缀改为yml即可)，直接配置：  
   server.port=8080  
   此时请求路径为：http://localhost:8080/admin/test  
   打开启动类：DemoApplication.java会发现main方法上有run|debug，点击run即可运行了。  
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/3189e37a-fea1-4465-8eee-1624f6ebe9d3)
   如果没有run|Debug怎么办？点击右上角的三角就会出来了：此操作会创建一个Tagert目录，即调试目录。  
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/35f6cf5c-c4a8-43ad-ae97-8fac92a192b1)
   运行过程：  
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f77d5133-d739-435c-9c63-6b92a1dd9333)
   此时浏览器访问就成功了！  
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/2ca20828-f36e-4832-899e-8cf58a2a866a)
11) Go to 'src' folder and create 'Controller' 'Service' 'Dao' 'Module' folders
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/39863326-b49e-4dea-8e20-baf96d95ef22)
12) 'Module' is for database relational table field name and setup "Get/Set"
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/cb04215f-c58f-4723-987a-8b36fbff3710)
    ```
    package com.example.demo.Pojo;

    public class Users {
        private Integer id;
        private String name;
        private String email;
   
        public Integer getId(){
            return id;
        }
        public void setId (Integer id){
            this.id = id;
        }
   
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
   
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }    
    }
    ```
14) 'Dao' setup sql CRUD functionality with @Mapper and @Component  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/94312ef2-6ea3-498b-9589-6e604fe2fc4e)
    ```
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
    ```
16) Go to Resource folder and open 'application.properties' file to setup Database connection and Mapper xml file
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/d37641a1-3bf7-4c7b-ba48-7de2146618ab)
    ```
    spring.application.name=demo

    server.port = 8080
    spring.datasource.url = jdbc:mysql://localhost:3306/SpringDatabase
    spring.datasource.username = root
    spring.datasource.password = root
    spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver

    mybatis.mapper-locations = classpath*:mapper/*.xml
    ```
18) Create 'Mapper' folder and xml file to mapping Dao sql CRUD functionality.
    Add @Mapper annotation for MyBatis xml scan.
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/55108d76-cc8a-4b86-9eae-5854dbe8c460)
    ```
    <?xml version="1.0" encoding="UTF-8"?>
    <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

    <mapper namespace="com.example.demo.Dao.UsersDao">
       <select id="selectAll" resultType="com.example.demo.Pojo.Users">
           select * from users
       </select>

       <select id="select" resultType="com.example.demo.Pojo.Users">
           SELECT DISTINCT * FROM USERS WHERE USERNAME = #{USERNAME}
       </select>
    
       <insert id="insert">
           INSERT INTO USERS (USERNAME, PASSWORD, EMAIL) VALUES (#{USERNAME}, #{EMAIL}, #{PASSWORD})
       </insert>
 
       <delete id="delete">
           DELETE FROM USERS WHERE USERNAME = #{USERNAME}
       </delete>
 
       <update id="update">
           UPDATE USERS SET EMAIL = #{EMAIL} WHERE USERNAME = #{USERNAME}
       </update> 
    </mapper>
    ```
20)  'Service' setup business logic for retrieving the data from 'Dao' module  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/097ad34e-56dd-4ab8-a89c-0982f6ff1a90)
    ```
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
    ```
    Add @Service("MysqlService") annotation https://blog.csdn.net/BAStriver/article/details/103671096   
    最常用的就是这种直接用@AutoWire的方式了：  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/c92d81d9-2b68-4cd6-9924-5b7e4dc3533f)
    还有，这种简单的方式也是可以的。  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/86fe232a-75f3-4c27-9cbd-eac76b03f06a)
    当我们用一个interface对应多个实现类，然后注入的时候可以这样指定一个@Service("")  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/8dd5768f-e231-42a2-9ac7-77be450158c2)
    也可以用@Resource来注入：  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/e0887702-4381-4b69-a234-c12e8a75b961)
22) 'Controller' setup interface with frontend react.js file to interact data.  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/8e951a84-6b33-4a8e-9179-561832fd214c)
    ```
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
    import org.springframework.jdbc.core.JdbcTemplate;

    import com.example.demo.Service.UsersService;
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

       @GetMapping("/selectall")
       public List<Users> selectAll(){
          return usersService.selectAll();
       }
    }
    ```
24) Main application file has to add @MapperScan to map 'Dao' module.  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/3e273114-6089-4903-abeb-5f43c83ead7f)
    ```
    package com.example.demo;

    import org.apache.ibatis.type.MappedTypes;
    import org.mybatis.spring.annotation.MapperScan;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import com.example.demo.Pojo.Users;

    @MappedTypes(Users.class)
    @MapperScan("com.example.demo.Dao")
    @SpringBootApplication
    public class DemoApplication {

         public static void main(String[] args) {
		      SpringApplication.run(DemoApplication.class, args);
	      }
      }
    ```
26) Connect MySQL from docker container with following codes in "application.properties" files.  
    ![image](https://github.com/user-attachments/assets/81979e14-7ed3-4251-90d7-43f57ab9b292)
    Get into Docker container of MySQL bash  
    docker exec -it mysql(docker name) bash \  
    mysql -u root -p \  
    enter password: root. \  
    SHOW DATABASES; \  

<a name = "mysql">MySQL Setup</a>
1) Install MySQL and MySQL WorkBench from Official Website
2) Open MySQL WorkBench
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/397ba58c-7b99-4a6f-975e-9c2aad060407)
4) Click 'Wrench' icon to setup MySQL connection
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/92c59042-beb1-46a4-aaea-859d3c1c5301)
5) Create Table and Fields from Database GUI.
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/ceb1d30a-cb91-4286-9b15-5d67a3d8a817)
6) Create MySQL from docker image  
   docker run -p 3306:3306 --name mysql \
   -v /mydata/mysql/log:/var/log/mysql \
   -v /mydata/mysql/data:/var/lib/mysql \
   -v /mydata/mysql/conf:/etc/mysql/conf.d \
   -e MYSQL_ROOT_PASSWORD=root \
   -d mysql:5.7

   

<a name = "mongo">MongoDB Setup</a>
1) Install MongoDB and MongoDB Compass from Official Website
2) Open MongoDB Compass
3) Go to 'New Connection' to setup new clusters
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/81bb454f-481f-41f1-9394-fab8f0655081)
4) Click on "Fill in connection fields individually" link and Select "Username/Password"
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/4d63cb5e-56bf-4279-aac6-27b6a7189708)
5) Setup Username and Password
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f0d60110-108c-4626-8dcb-316cdced22ba)
6) Connect to the created connection and click on "Create Database"
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/d5fb5bba-47a3-45ed-bd38-d52b3d9c79ed)
7) Then click on "Create Collection"
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/b5f5eb4b-d50c-4cb9-8055-89d927955f46)
8) Click on "Add Data" to insert document.
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/6ca7698b-9dd7-4ec8-b140-334d111e732c)

<a name = "reactjs">ReactJS</a>
1) Input following dependencies directly in React.js file
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/835fc969-d88c-40fe-ba44-abfee74d7cd4)
```
<!-- 引入react -->
<script src="https://unpkg.com/react@16/umd/react.development.js" crossorigin></script>
<!-- 引入react-dom -->
<script src="https://unpkg.com/react-dom@16/umd/react-dom.development.js" crossorigin></script>
<!-- 引入Babel,使浏览器可以识别JSX语法，如果不使用JSX语法，可以不引入 -->
<script src="https://unpkg.com/babel-standalone@6/babel.min.js"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/axios/0.19.2/axios.min.js"></script>
```
