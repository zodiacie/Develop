目录:  
[UFT](#uft)  
[ATF](#atf)  
[Postman](#postman)  

<a name = "uft">UFT</a>  
1) OpenChrome
```
Function OpenChrome()
    Set chrome = CreateObject ("WScript.Shell")
    chrome.Run "Chrome.exe -url https://cibcsit.service-now.com"    
End Function
Function AccountFees ()
   Set browser_obj = Description.Create
   browser_obj("creationtime").value = "0"
   Set page_obj = Description.Create
   page_obj("abs_x").value = "0"

   Set snb = Browser(browser_obj)
   Set snp = snb.Page(page_obj)
   Set snsearch = snp.RunScript("document.getElementById('filter');")
   Set snsearch2 = snp.RunScript("document.getElementById('sysparm_search')")
   snsearch.value = "incident"
   snsearch2.value = "service"
   snp.RunScript("alert('hello')")
End Function
Function GetIt()  
   Set browser_obj = Description.Create
   browser_obj("creationtime").value = "0"
   Set page_obj = Description.Create
   page_obj("abs_x").value = "0"
   
   Set link_obj = Description.Create
   link_obj("micclass").value = "Link"
   link_obj("name").value = "getIT"
   
   Set link_obj2 = Description.Create
   link_obj2("micclass").value = "Link"
   'link_obj2("name").value = "Service Catalog"
   link_obj2("name").value = "Create New – No Template"
   
   Set snb = Browser(browser_obj)
   Set snp = snb.Page(page_obj)
   'Set swl = snp.WebList(weblist_obj)
   Set slk = snp.Link(link_obj)
   slk.Click
   Set slk2 = snp.Link(link_obj2)
   slk2.Click
   snp.RunScript("alert('hello')")
End Function
Call OpenChrome()
   wait 50
   'Call GetIt()
   'wait 10
Call AccountFees()
```

<a name = "atf">ATF</a>  
```
(function(outputs, steps, stepResult, assertEqual) {
   // add test script here
   //var number_id;
   var gr = new GlideRecord ('sc_request');
   //gr.query('Number','REQ0010005');
   /*gr.initialize();
   gr.price = '20';
   gr.active = 'true';
   gr.insert();*/
   gr.orderByDesc('sys_created_on');
   gr.setLimit(1);
   gr.query();
   if (gr.next()){
      //gs.print (gr.sys_id + '-' + gr.number + ' - ' + gr.sys_created_on);
      outputs.table = gr.getRecordClassName();
      outputs.record_id = gr.number;
      stepResult.setOutputMessage('Successfully output - ' + gr.sys_id + '-' + outputs.record_id + ' - ' + outputs.table + '-' +gr.sys_created_on);
      //gr.deleteMultiple();
   }
   /*gr.orderByDesc('sys_created_on');
   gr.setLimit(1);
   gr.query();
   if (gr.next()){
      stepResult.setOutputMessage(gr.sys_id + '-' + gr.number + ' - ' + gr.sys_created_on);
   }
}
(function(outputs, steps, stepResult, assertEqual) {
    // add test script here
   var SYSID = '83a88f2a2f2f00105282d6c6f699b644';
   var record = steps(SYSID).record_id;
   //var record = steps(SYSID).table;
   stepResult.setOutputMessage('Successfully output - ' + record);
})(outputs, steps, stepResult, assertEqual);
```
![image](https://github.com/zodiacie/Automation/assets/57634982/7307919b-a13a-40b4-b671-e158b8b0fe09)  
![image](https://github.com/zodiacie/Automation/assets/57634982/70a383d0-e963-4345-b94d-c2f13eedf6e7)  

<a name = "postman">Postman</a>
我粗略概括为 3 个问题：
1. 如何判断接口是否请求成功？
2. 如何进行接口批量、定期测试？
3. 如何处理依赖接口问题（比如商品下单的接口必须要求先登录）？
1.1 功能区
   ![image](https://github.com/zodiacie/Automation/assets/57634982/0825e7fe-84ff-491d-b90b-9c173cd206f6)  
1.2 脚本相关  
responseCode ：包含请求的返回的状态信息(如：code)。  
responseBody：为接口请求放回的数据内容（类型为字符串）。  
tests ：为键值对形式，用于表示我们的测试结果是成功与否，最终展示在 Test Results 中。  
responseTime ：请求所耗时长  
postman ：可以做的比较多，比如获取返回数据的头部信息：`postman.getResponseHeader("")`  
1.3 代码模板(Postman using Javascript)  
tests["Status code is 200"] = responseCode.code === 200;  
tests["Body matches string"] = responseBody.has("这里可以改为你要判断的关键字内容");    
tests["has access_token"] = responseBody.has("access_token");  
2 集合(批量)测试
   ![image](https://github.com/zodiacie/Automation/assets/57634982/0d470af7-9a8b-4335-9a4c-09bfdd42b59b)
2.1 批量执行
   ![image](https://github.com/zodiacie/Automation/assets/57634982/e41095e5-86e3-497a-b1b6-f095434cebfb)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/c831c267-529b-4901-9ff1-31c91dc3e3f7)
2.2 变化的参数数据
   ![image](https://github.com/zodiacie/Automation/assets/57634982/8a26fcbf-5976-440f-adf5-801a4d07918c)
   使用变量
   ![image](https://github.com/zodiacie/Automation/assets/57634982/47e6f006-f21e-4f1f-8c92-77911269d1a6)
   Pre-request Script  
   Pre-request Script 与 Tests 类似，  
   区别在于：Pre-request Script 中的脚本是在执行请求之前运行，而Tests 中的脚本则是在请求完成之后执行。  
   "所以，我们可以在 Pre-request Script 功能区中用脚本先个上面两个变量进行赋值."  
   //设置全局变量      
   postman.setGlobalVariable("username", "test1");  
   postman.setGlobalVariable("password", "123456");  
   测试数据集  
   ![image](https://github.com/zodiacie/Automation/assets/57634982/adf356b1-5bfe-42ac-ba49-83cf760c0394)  
   ![image](https://github.com/zodiacie/Automation/assets/57634982/edaa4c46-108f-4f8c-9269-3093b0f033fa)  
2.3 定期任务
   ![image](https://github.com/zodiacie/Automation/assets/57634982/fd5f6871-5121-4fa3-8cc2-9d2c31144468)
3 请求依赖问题
   ![image](https://github.com/zodiacie/Automation/assets/57634982/8ce29ae1-0a76-4232-9fe2-0fdb508a1e6d)
3.1 接口执行顺序
   ![image](https://github.com/zodiacie/Automation/assets/57634982/21c23a72-e303-4e1f-89b3-b17b82c49b1a)
3.1.2 自定义执行顺序
   ![image](https://github.com/zodiacie/Automation/assets/57634982/8a9579ea-b648-4036-a32e-839d02997aab)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/00215d8f-006a-478b-b1fd-3854c0bb06ee)
3.2 数据传递
3.2.1 全局变量
   "Postman 不仅支持代码设置全局变量的方式，它还支持可视化操作："
   ![image](https://github.com/zodiacie/Automation/assets/57634982/9795bba6-27a9-4bf2-b1e8-6c17831e08ba)
   进入对应界面后，便可直接进行管理：
   ![image](https://github.com/zodiacie/Automation/assets/57634982/bd7dc83d-9192-4cf3-8843-43f285031676)
3.2.2 多环境区分与切换
   参数的创建
   ![image](https://github.com/zodiacie/Automation/assets/57634982/59c01328-6e3d-4b7f-9bc3-86c4bab8084d)  
   我在每个环境中都创建了一个 host 参数，如：
   ![image](https://github.com/zodiacie/Automation/assets/57634982/8f93b522-3b8a-4eae-ab86-151a9ef77254)
   使用与切换
   ![image](https://github.com/zodiacie/Automation/assets/57634982/11602b07-3d44-4f6b-9176-cd310822d623)
3.3 解决依赖问题
   ![image](https://github.com/zodiacie/Automation/assets/57634982/48b0d9a6-a2e7-4495-9196-2c9e2cd9800d)
   Postman 中的操作
   ![image](https://github.com/zodiacie/Automation/assets/57634982/39a9d7a5-8428-41a6-adef-064ec0bc5a80)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/a470bd4b-7523-45a4-85dd-7cbbca92643a)
