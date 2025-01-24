[Selenium Python](#SeleniumPython) 

[Selenium Setup ChromeDriver](#SeleniumChrome)

Install "Requests" module from Pypi
1) pip install requests
![image](https://github.com/zodiacie/Automation/assets/57634982/6d591961-2216-4ee3-8ef9-cc3400d26fe4)

<a name = "SeleniumPython">Selenium Setup Python</a>
1) Install Python3.x and VSCode "sudo apt update" and "sudo apt install python3"
2) Setup Path of Python in system environment (only for windows)
3) Update "sudo apt update"
4) Install "sudo apt install python3"
5) Verify "python3 --version"
6) Install pip "sudo apt-get install python3-pip" (only for Ubuntu)
7) Verify pip "pip --version" and go to "/usr/lib/python3/dist-packages/pip" folder
8) Install Selenium for Python "sudo pip install -U selenium"
9) Go to "cd /usr/local/lib/python3.10/dist-packages" folder to verify selenium version.
10) Go to "/home/sean/Downloads" folder and Download Chrome "wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb"
11) Install Chrome "sudo dpkg -i google-chrome-stable_current_amd64.deb"
12) VSCode -> Extensions section to install Python plugins (Python, Pylance etc).![image](https://github.com/zodiacie/Automation/assets/57634982/518f1817-e519-4f76-9079-d98cb5283806)
13) Create Python File -> Ctrl + Shift + P -> Python File.![image](https://github.com/zodiacie/Automation/assets/57634982/1ae87b2a-9b4c-4d52-bd8c-0fa38368f0dc)
14) Create BaseDriver.py to setup WebDriver.![image](https://github.com/zodiacie/Automation/assets/57634982/f9c5aae3-6f9e-46bc-b508-bec1e003660e)
15) Create Test Script with UnitTest and make sure function name starts with "test".![image](https://github.com/zodiacie/Automation/assets/57634982/ef0b885f-8ae4-4f6f-81af-68e24e82959d)
16) Setup Python Test Framework -> Click "Enable and Configure a Test Framework".![image](https://github.com/zodiacie/Automation/assets/57634982/6ad86573-f007-41bf-98c9-1600674428c9)![image](https://github.com/zodiacie/Automation/assets/57634982/9043227d-e956-4c78-8377-4ce2a3c3131f)
17) Or you may go to "Test" icon and click on "Configure Python Tests" to configure the same.  
   ![image](https://github.com/zodiacie/Automation/assets/57634982/4090033d-e3fb-4679-9186-7e1116d4dd6f)
18) Select "Unittest" from the dropdown list.![image](https://github.com/zodiacie/Automation/assets/57634982/884f1a0e-f1af-4ffe-9ba1-3fc14dd8944b)
19) Right click on "Root Directory" to choose the *.py files type and location.![image](https://github.com/zodiacie/Automation/assets/57634982/635b1133-6a5b-4fb0-afd8-1c842104126a)
20) Choose one type based on your name convention.![image](https://github.com/zodiacie/Automation/assets/57634982/a76daeff-f17c-4db2-ae95-456c9a66f936)
21) Go to download and install "Beautiful Report" (python setup.py install https://pypi.org/project/BeautifulReport/#files).  
    ![image](https://github.com/zodiacie/Automation/assets/57634982/469f40ba-dd1d-414c-9742-4fd5cd499c98)

<a name = "SeleniumChrome">Selenium Setup Chrome</a>
1) Download Chromedriver from "https://chromedriver.chromium.org/downloads/version-selection" website.
2) Install Unzip "sudo apt install unzip" first.
3) Unzip " unzip [FileName].zip" downloaded Chromedriver.
4) Move chromedriver to "sudo mv chromedriver /usr/bin/chromedriver" folder
5) Config chromedriver "sudo chown root:root /usr/bin/chromedriver
6) Config chromedriver "sudo chmod +x /usr/bin/chromedriver"
