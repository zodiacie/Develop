[maocOS VMWare Install](#macInstall)

[Appium iOS](#AppiumiOS)

[Appium Android](#AppiumAndroid)  

<a name = "macInstall">MacOS VMWare Install</a>
1) Open VMWare and select "Install IOS later" the third option
2) Choose Hardware config for 4gb ram and 1 processor with 2 cores
3) Choose single one harddisk and 30gb space
4) Choose DVD option and select macOS Sierra.iso
5) Save and finish the setting
6) Download "WMWare unlock tool" and run as administrator of "win-install.cmd" file to install
7) Open macOSSierra.vmx by notepad and Add (smc.version = "0") at end of the file
8) And then edit as (ethernet0.virtualDev = "vmxnet3") and save the macOSSierra.vmx file
9) Start the macOS virtual machine and Select "Utilities" and "Disk Utility" item
10) Select "VMWare Virtual SATA Hard Drive Media" item and click Erase button
11) Type "name" value and click erase button again and Follow the step to continue and finish the installation.
12) Turn off macOS system and go to VMWare to deselect DVD disk "Connect on Power" option.
13) Open macOS again and go to "VM" menu and select "Install VMWare tool" option to install the VMWare tool and After installation, restart the macOS and it displays full screen.

<a name = "AppiumiOS">Appium iOS</a>

1) Download and install Xcode tool
2) Once it's installed, click "Xcode" menu and select "Open Developer Tool" item, then choose "Simulator" item to open simulator.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/87a01e58-5fa9-449d-a486-aecc88f29d4c)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/46a907f0-e94b-441e-b73c-8eea10f8b662)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/7d7a6997-c410-4013-86b7-bea221bf945a)
3) Install "Brew": Go to "https://brew.sh/" and copy "/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"" command to macOS terminal to execute.
4) Install "Carthage": Go to macOS terminal and type "brew install carthage"
5) Install "Appium-Doctor" (This is optional): Go to macOS terminal and type "npm install -g appium-doctor". it's for verify appium function properly (appium-doctor --ios)
6) Downlaod and install Appium.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/0ba58c73-f42b-49f6-b109-2e4d8774846e)
7) Change the "Host" address to "127.0.0.1"  
   ![image](https://github.com/zodiacie/Automation/assets/57634982/364e1954-ab92-4630-ace5-f1c40a63a682)
9) Type "xcodebuild -showsdks" to display simulator names
   ![image](https://github.com/zodiacie/Automation/assets/57634982/6d33eb0b-114a-460f-a9c1-dafb4d89e4a5)
10) Type "xcodebuild -sdk (simulator name)" to create simulator app under xcode project folder.  
   ![image](https://github.com/zodiacie/Automation/assets/57634982/12c7f81e-70fd-4c01-a21d-f4b060dc2f13)
11) Go to Appium and click "Start Server" button  
   ![image](https://github.com/zodiacie/Automation/assets/57634982/4caff5c1-03dd-4f21-8a5e-13e0a4c550f8)
12) Click "Start Inspector Session" button and type following inputs. Save the inputs and start the session.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/e412de18-5d8e-493c-b466-723aad570076)
13) Appium should be starting properly.

   

   


 




<a name = "AppiumAndroid">Appium Android</a>
1) Install Android Studio from Official Website.
2) Open Android Studio, it will download and setup automatically.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/1e6a6577-59f3-484a-85f0-f03134bf0790)
3) Setup 'JAVA_HOME' 'Path' and 'ANDROID HOME' in environment variable.  
   JAVA_HOME for JDK, ANDRIOD_HOME for Android SDK location, Path for JDK tools.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/8b2c0a0c-a414-48a5-bd04-f59bf947be0b)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/84b8a2e7-8448-4096-b59d-daff62fe4a58)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/d6be3586-9ec4-4091-806a-b66f6493f00e)
4) Setup Virtual Device in Android Studio
   ![image](https://github.com/zodiacie/Automation/assets/57634982/ae8439f0-3a2d-438f-bc33-fb80ffca3573)
5) Select 'Pixel 2' and click 'Next'
   ![image](https://github.com/zodiacie/Automation/assets/57634982/d37a6fca-300f-4672-9a3b-6569bf1e9f86)
6) Select available item and click on 'Next'
   ![image](https://github.com/zodiacie/Automation/assets/57634982/288203d4-4030-48fa-9c60-45367422d1ec)
7) Click on 'Finish'
   ![image](https://github.com/zodiacie/Automation/assets/57634982/dc0a7785-2158-4ecb-b369-0fa2d9cced42)
8) Start Android Emulator
   If there's no system_images folder in SDK folder, please following  
   https://dl.google.com/android/repository/sys-img/google_apis/x86-27_r09.zip.  
   Unzip and put it under \Sdk\system-images\android-27\google_apis\x86  
   ![image](https://github.com/zodiacie/Automation/assets/57634982/4b167326-f05a-4c5f-b966-09b4b669f363)
9) Install the Appium from Official website
10) Start Appium Desktop and put "127.0.0.1" in Host
    ![image](https://github.com/zodiacie/Automation/assets/57634982/06b05afd-9cec-4d72-a71b-57fea9980665)
11) Click on 'Edit Config' button to config the following
    ![image](https://github.com/zodiacie/Automation/assets/57634982/705e7523-8147-4b18-a7e5-9fef70768e1b)
12) Click on "Start Server"
    ![image](https://github.com/zodiacie/Automation/assets/57634982/9016ddc3-cea9-4b48-9ef3-3af82c14a29f)
13) Click on 'Magnifying Glass' icon
    ![image](https://github.com/zodiacie/Automation/assets/57634982/deb5add2-29c0-4507-ba2b-6600c65ad39e)
14) Go to 'Desired Capabilities' section
    ![image](https://github.com/zodiacie/Automation/assets/57634982/935eb048-0fee-4af5-a455-54d0d1995905)
    "automationName": "Appium",  
    "platformName": "Android",  
    "platformVersion": "8.1", Version# can be found in Android Studio Device Manager section.  
    "deviceName": "127.0.0.1:5554" Connect Port# can be found in CMD  
    ![image](https://github.com/zodiacie/Automation/assets/57634982/efcf849f-9c45-40d8-9d47-eccaf4d9e15c)
    ![image](https://github.com/zodiacie/Automation/assets/57634982/fa03549a-99aa-4c6e-870a-3c40a8bccd02)
15) Save the settings and Click 'Start Session'
    ![image](https://github.com/zodiacie/Automation/assets/57634982/622e6a5f-ccb9-4821-b618-81391710cedc)
16) Install Python Appium from official websiten (under file folder -> cmd python setup.py install)
17) Import Webdriver from Appium and put 127.0.0.1:4723 as connection
    ![image](https://github.com/zodiacie/Automation/assets/57634982/b20e2f02-3448-4cd8-b812-2bb38603ee88)
