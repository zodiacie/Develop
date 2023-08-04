![image](https://github.com/zodiacie/FullStack/assets/57634982/2f15df84-a489-4729-93d1-8d86a1e76835)# FullStack
电商实战项目   
1.NewBee电商 https://github.com/newbee-ltd/newbee-mall  
2.Swarm微服务 https://github.com/macrozheng/mall-swarm  
3)SpringCloud https://github.com/SiGuiyang/spring-cloud-shop  
4)移动端电商 https://github.com/lucisl/ddBuy  
5)Mall4J电商 https://github.com/gz-yami/mall4j  
6)仿小米电商(NodeJS) https://gitee.com/hai-27/vue-store  
7)Lilishop https://gitee.com/beijing_hongye_huicheng/lilishop  

目录:  
[SpringBoot](#springboot)  
[NodeJS](#nodejs)  
[ReactJS](#reactjs)  
[MySQL Setup](#mysql)  
[MongoDB Setup](#mongo)  
[Bitcoin Setup](#bitcoin)  
[Etherum Setup](#etherum)  

<a name = "springboot">SpringBoot Setup</a>  
1) VSCode 里安装Java Extension Pack和Spring Boot Extension Pack
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
13) 'Dao' setup sql CRUD functionality with @Mapper and @Component  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/94312ef2-6ea3-498b-9589-6e604fe2fc4e)
14) Go to Resource folder and open 'application.properties' file to setup Database connection and Mapper xml file
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/d37641a1-3bf7-4c7b-ba48-7de2146618ab)
15) Create 'Mapper' folder and xml file to mapping Dao sql CRUD functionality.
    Add @Mapper annotation for MyBatis xml scan.
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/55108d76-cc8a-4b86-9eae-5854dbe8c460)
16)  'Service' setup business logic for retrieving the data from 'Dao' module  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/097ad34e-56dd-4ab8-a89c-0982f6ff1a90)
    Add @Service("MysqlService") annotation https://blog.csdn.net/BAStriver/article/details/103671096   
    最常用的就是这种直接用@AutoWire的方式了：  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/c92d81d9-2b68-4cd6-9924-5b7e4dc3533f)
    还有，这种简单的方式也是可以的。  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/86fe232a-75f3-4c27-9cbd-eac76b03f06a)
    当我们用一个interface对应多个实现类，然后注入的时候可以这样指定一个@Service("")  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/8dd5768f-e231-42a2-9ac7-77be450158c2)
    也可以用@Resource来注入：  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/e0887702-4381-4b69-a234-c12e8a75b961)
17) 'Controller' setup interface with frontend react.js file to interact data.  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/8e951a84-6b33-4a8e-9179-561832fd214c)
18) Main application file has to add @MapperScan to map 'Dao' module.  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/3e273114-6089-4903-abeb-5f43c83ead7f)

<a name = "nodejs">NodeJS</a>
1) Install Nodejs from official website.  
2) Install "express-generator" (npm install -g express-generator)  
3) Install "express" (npm install -g express)  
4) Above is Global install Express in C:\Users\Administrator\AppData\Roaming\npm  
5) Below is Local install Express - Go to specific created project folder  
6) Install "express-generator" (npm install -g express-generator)  
7) Install "express" (npm install -g express)  
8) Cmd 'express -e app' to create "app" named express project folder in current folder  
9) Cd into 'app' folder and cmd 'npm install' amd 'npm start' to install and start the 'app' project.  
10) Type 'Localhost:3000' to start express as following  
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/f097ab29-a415-44e1-b1f5-a6ac5d294382)
11) Create 'config' folder and create dbconfig.js file to connect MySQL
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/1cf0385d-7e17-49c4-a48d-b894f6bf444a)
12) Create node.js file under 'app' folder
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/bad79d03-d5bf-41aa-8d31-98e0551f244f)
13) Require 'Express', 'Cors' and 'body-parser' module for Insert and Update function.
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/d85ce427-35a2-4d10-aab5-45dc8c55d649)
14) Use following lines to require front GUI react.js file  
    const front = express ();  
    front.use(express.static('../reactjs'));
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/13089a7c-8dc6-4c72-b355-e946cca642c7)
    ![image](https://github.com/zodiacie/FullStack/assets/57634982/df47ff74-4d4e-4e7d-b111-b77a64b9c1f1)


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

<a name = "mysql">MySQL Setup</a>
1) Install MySQL and MySQL WorkBench from Official Website
2) Open MySQL WorkBench
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/397ba58c-7b99-4a6f-975e-9c2aad060407)
4) Click 'Wrench' icon to setup MySQL connection
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/92c59042-beb1-46a4-aaea-859d3c1c5301)
5) Create Table and Fields from Database GUI.
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/ceb1d30a-cb91-4286-9b15-5d67a3d8a817)

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

<a name = "bitcoin">Bitcoin Private Chain Setup</a>
1) 比特币区块链是两遍SHA256的Hash算法
   https://learnku.com/python/t/22970/build-your-own-block-chain-step-by-step-with-python
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/b15cd35d-6f0d-4a70-a36a-c20524e79918)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/5d86f544-976f-443a-b8a3-594e9c7506f7)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/fb978539-01b2-4b3a-8c66-841fc0cf9f57)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f51ef9fe-e8b3-48d9-9148-1fa69274fbd6)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/1fb55f62-f653-4c04-9791-43eba51d95bc)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f6f22110-2814-4313-97c4-6eb36be3ceba)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/8f261512-53ed-49e0-8190-258f6bc00d8c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/a576828a-539e-4c83-a040-2f5127c347b3)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/09a44eb2-6329-444b-bfb6-4a692ab669e5)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/e822fd29-4adc-40cf-8da9-5c173237f184)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/a5b18155-c7c3-4b65-a284-2a515a0a46cd)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/97f68235-bb88-471c-b01a-de5493101027)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/d7e5268c-8181-4138-8899-0597cc54d46c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/cc0df12d-3b96-4c19-9cf2-fafdca54bfc4)

<a name = "etherum">Ethrum Private Chain Setup</a>
1) 以太坊区块链通过读取Memory Hard Mining Puzzle。 以太坊中，设计了两个数据集，一大一小。小的为16MB的cache，大的数据集为1G的dataset(DAG)，1G的数据集是通过16MB数据集生成而来的。16MB的Cache数据生成方式：通过Seed进行一些运算获得第一个数,之后每个数字都是通过前一个位置的值取哈希获得的大的DAG生成方式：大的数组中每个元素都是从小数组中按照伪随机顺序读取一些元素。如第一次读取A位置数据，对当前哈希值更新迭代算出下一次读取位置B，再进行哈希值更新迭代计算出C位置元素。如此来回迭代读取256次，最终算出一个哈希值作为DAG中第一个元素，如此类推，DAG中每个元素生成方式都依次类推。
   https://learnblockchain.cn/books/geth/part2/consensus/ethash_implement.html
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/8a59fdab-6998-4614-ae86-2a120dbd0949)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/3f7caf14-ddc1-4b9d-9043-e67860336fae)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/200c8535-68f6-4898-818f-7f691096ef05)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/4f4e5091-b352-4d90-a75f-26bea3c5985d)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/b691bdba-0d56-44d3-b5c7-045815da28be)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/d64bfbdd-0959-46cc-ba44-c4e0bc4f830b)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/ec8f0fb6-29db-4d16-9fec-48aa3acce420)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/042fa707-dcb0-404c-8402-628dcebef62c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/d2bd02b0-7dd8-4fe7-858e-92d4fe9545cf)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/54e78b8b-3a0f-433a-88e6-1a8bb73417f1)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/3f08ce0b-fe24-4115-ad5d-c5a6d06bc7d4)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/2b62beb8-c823-422e-8170-98162bd9a6e0)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f91c66e3-8da7-4d6f-a1e2-097a0981e8e3)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/7a7e5656-b379-4290-a4ca-06a46bd196d2)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f2617a1a-be13-4fda-993c-ccb769b0bf03)
2) 挖矿算法
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/9b8f8b62-5160-4aa2-8821-50875e62254f)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/274ed11e-bf6e-4d49-a9b1-de3ad155c514)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/0d6397c2-0c0f-4091-bf0b-76013a4206ab)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/e8bb2c62-ca5a-42f3-8164-b2536d04538c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/8e86885e-9648-43ee-830c-1e535c631c26)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/54d7f704-1547-4ec9-8d52-b4b791af6257)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/4febd913-adab-43ab-bb15-375bbbaf0313)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/63fe72b3-71e6-43ef-9d2d-cd7d853a35ea)
3) 以太坊私有链创建
   https://blog.csdn.net/andy_zhang2007/article/details/102858390






















































  
















