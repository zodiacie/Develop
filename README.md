目录:  
[NodeJS](#nodejs)  
[MySQL Setup](#mysql)  
[MongoDB Setup](#mongo)  
[ReactJS](#reactjs)  


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

   docker exec -it mysql(docker name) bash \
   mysql -u root -p \
   enter password: root. \
   SHOW DATABASES; \

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
