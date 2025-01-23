[Selenium Setup Java](#SeleniumJava) 

[Selenium Setup ChromeDriver](#SeleniumChrome)

<a name = "SeleniumJava">Selenium Setup Java</a>
1) Install Java and VSCode
2) Setup JAVA_HOME and Path in system environment.
3) Open VSCode -> Ctrl + Shift + P -> create “Maven” project.![image](https://github.com/zodiacie/Automation/assets/57634982/1c619900-bc68-42df-b496-1fb440390e19)
4) Choose “archetype-quickstart-jdk8”item.![image](https://github.com/zodiacie/Automation/assets/57634982/e6e22e48-b03c-40bb-a556-972d15d85edc)
5) Choose default version and input “groupId” and “artifactId” to save the “Maven” project.![image](https://github.com/zodiacie/Automation/assets/57634982/81908a48-e963-47f3-ba8f-61280384302e)
6) Go to pom.xml to disable and add following code.![image](https://github.com/zodiacie/Automation/assets/57634982/ef74db4d-241a-4cca-a2a1-d313b770008f)
7) Add “Plugin” tag as following in pom.xml file.![image](https://github.com/zodiacie/Automation/assets/57634982/d1af16c0-7476-493e-84a8-a050a25da92f)
8) Disable “CheckStyle” as following.![image](https://github.com/zodiacie/Automation/assets/57634982/bcc913bd-43c2-4997-9276-8fc051841354)
9) Go to “test” folder and create “resources” folder, create “testing.xml” file under “resources” folder.![image](https://github.com/zodiacie/Automation/assets/57634982/483e418a-0473-4237-aa60-552686dbbb3b)
10) Go to “Maven”section and right on “servicenow”project to click on “Clean” -> then click on “compile”-> then click on “test”to execute.![image](https://github.com/zodiacie/Automation/assets/57634982/df74497b-fbb3-416f-a2a6-64df89669e2b)

<a name = "SeleniumChrome">Selenium Setup Chrome</a>
1) Download Chrome "wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb"
2) Install Chrome "sudo dpkg -i google-chrome-stable_current_amd64.deb"
3) Check if there's any errors "sudo apt -f install"
4) Download Chromedriver from "https://chromedriver.chromium.org/downloads/version-selection" website.
5) Install Unzip "sudo apt install unzip" first.
6) Unzip " unzip [FileName].zip" downloaded Chromedriver.
7) Move chromedriver to "sudo mv chromedriver /usr/bin/chromedriver" folder 
8) Config chromedriver "sudo chown root:root /usr/bin/chromedriver
9) Config chromedriver "sudo chmod +x /usr/bin/chromedriver"
