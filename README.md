[Selenium C#](#SeleniumCSharp)  

<a name = "SeleniumCSharp">Selenium C#</a>
1) Install .Net SDK for Windows
2) Open VSCode and install following Extensions
   ![image](https://github.com/zodiacie/Automation/assets/57634982/8a6eecd6-35a4-42fe-887d-a215d0d6139a)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/bb0aabe8-a943-44d5-92d0-6b7a324e917d)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/5666f429-2f15-4ec8-9567-e89eb5702974)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/5166bd36-5867-4b5b-9997-eac513bca3f0)
3) Create new folder and type "dotnet new nunit" under the created folder in Vscode Terminal console
   ![image](https://github.com/zodiacie/Automation/assets/57634982/e05c56e3-6be8-4c12-b4d2-4e99226fe2fa)
4) Type "dotnet build" and Go to "Bin" folder and copy ChromeDriver.exe in the folder
   ![image](https://github.com/zodiacie/Automation/assets/57634982/20621d01-3108-4202-ad16-6e560fb30eff)
5) Go to Using.cs file and type "global using OpenQA.Selenium; global using OpenQA.Selenium.Chrome;"
   ![image](https://github.com/zodiacie/Automation/assets/57634982/541f273e-d129-4ca6-ac3f-d91dd5f309c3)
6) Go to UnitTest1.cs file and Type following
   ![image](https://github.com/zodiacie/Automation/assets/57634982/b492fd9b-eb9e-4d2e-bbe9-1f55d6b7f7c0)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/5324e187-1560-41f5-847d-2b0241860165)
7) Go to Terminal console and type "dotnet build"
   ![image](https://github.com/zodiacie/Automation/assets/57634982/57b4dd30-4a18-4663-bd8e-fd6a94c94df3)
8) Go to "View" menu and select "Command Palette"
   ![image](https://github.com/zodiacie/Automation/assets/57634982/39e1fe28-a7a2-451f-ae8a-adf45ea7db09)
9) Select "Nuget Package Manager" item
   ![image](https://github.com/zodiacie/Automation/assets/57634982/9ce52b7a-3671-46ce-8f07-a654e96f7743)
10) Enter "RestSharp" item and Select version.
    ![image](https://github.com/zodiacie/Automation/assets/57634982/613dfaf3-4397-4d57-9ad9-730b2b869549)
    ![image](https://github.com/zodiacie/Automation/assets/57634982/6e6a67c9-d10c-4592-8d25-7132c8e64de0)
11) Add "RestSharp" in Using.cs for RESTAPI testing.
    ![image](https://github.com/zodiacie/Automation/assets/57634982/86f5dd14-96b2-4ae2-9fa1-f69fec45a2b0)
12) Config Test script -> Go to Setting Icon and select "Setting" item
    ![image](https://github.com/zodiacie/Automation/assets/57634982/a2d3cc21-cd23-4bb3-b16e-6c7fcb46af2d)
    ![image](https://github.com/zodiacie/Automation/assets/57634982/0fd62a82-7036-4e7a-ad4e-f453f120d867)
13) Go to Setting Found textfield and type "testprojectpath", then type "*.csproj" file name in the following textfield. It will save by itself.
    ![image](https://github.com/zodiacie/Automation/assets/57634982/78381241-fe28-4539-8dc5-16e58a5599da)
    ![image](https://github.com/zodiacie/Automation/assets/57634982/68330ab5-717c-4dfd-b76b-69468172fbf9)
14) Go to "View" menu and select "Command Palette"
    ![image](https://github.com/zodiacie/Automation/assets/57634982/eaf01a3f-7b39-42ef-8aa2-e9a8a1cdf981)
15) Select "Nuget Package Manager" item
    ![image](https://github.com/zodiacie/Automation/assets/57634982/d3fb0b44-b943-4732-b784-48459181b789)
16) Enter "Selenium" item and Select "Selenium.WebDriver" version.
    ![image](https://github.com/zodiacie/Automation/assets/57634982/a8d97f86-0c47-48f0-8525-9c27c32a17ad)
    ![image](https://github.com/zodiacie/Automation/assets/57634982/91079292-65da-483e-986c-835cf420cf62)
