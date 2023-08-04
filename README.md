# FullStack
电商实战项目   
1.NewBee电商 https://github.com/newbee-ltd/newbee-mall  
2.Swarm微服务 https://github.com/macrozheng/mall-swarm  
3)SpringCloud https://github.com/SiGuiyang/spring-cloud-shop  
4)移动端电商 https://github.com/lucisl/ddBuy  
5)Mall4J电商 https://github.com/gz-yami/mall4j  
6)仿小米电商(NodeJS) https://gitee.com/hai-27/vue-store  
7)Lilishop https://gitee.com/beijing_hongye_huicheng/lilishop  

[SpringBoot](#springboot)

<a name = "springbbot">SpringBoot Setup</a>
1)VSCode 里安装Java Extension Pack和Spring Boot Extension Pack
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
1) Go to 'src' folder and create 'Controller' 'Service' 'Dao' 'Module' folders
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/39863326-b49e-4dea-8e20-baf96d95ef22)
2) 'Module' is for database relational table field name and setup "Get/Set"
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/cb04215f-c58f-4723-987a-8b36fbff3710)
3) 'Dao' setup sql CRUD functionality with @Mapper and @Component  
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/94312ef2-6ea3-498b-9589-6e604fe2fc4e)
4) Go to Resource folder and open 'application.properties' file to setup Database connection and Mapper xml file
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/d37641a1-3bf7-4c7b-ba48-7de2146618ab)
5) Create 'Mapper' folder and xml file to mapping Dao sql CRUD functionality.
  Add @Mapper annotation for MyBatis xml scan.
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/55108d76-cc8a-4b86-9eae-5854dbe8c460)
6) 'Service' setup business logic for retrieving the data from 'Dao' module  
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/097ad34e-56dd-4ab8-a89c-0982f6ff1a90)
  Add @Service("MysqlService") annotation https://blog.csdn.net/BAStriver/article/details/103671096  
  最常用的就是这种直接用@AutoWire的方式了：  
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/c92d81d9-2b68-4cd6-9924-5b7e4dc3533f)
  还有，这种简单的方式也是可以的。  
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/86fe232a-75f3-4c27-9cbd-eac76b03f06a)
  当我们用一个interface对应多个实现类，然后注入的时候可以这样指定一个@Service("")  
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/7c413b55-bffd-4ca7-bae6-5a2264b32f0b)
  也可以用@Resource来注入：  
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/e0887702-4381-4b69-a234-c12e8a75b961)
7) 'Controller' setup interface with frontend react.js file to interact data.  
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/8e951a84-6b33-4a8e-9179-561832fd214c)
8) Main application file has to add @MapperScan to map 'Dao' module.  
  ![image](https://github.com/zodiacie/FullStack/assets/57634982/3e273114-6089-4903-abeb-5f43c83ead7f)







  
















