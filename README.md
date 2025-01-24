目录:  
[Cloud Setup](#cloudsetup)  
[Putty Setup](#puttysetup)  

<a name = "cloudsetup">Cloud VM Setup</a>
1) Go to "Get started" to Create Linux instance from Oracle Cloud
   ![image](https://github.com/zodiacie/Automation/assets/57634982/a794822a-dff3-4cb6-9f2e-1b895f27df64)
2) Go to "Create a VM instance" link
   ![image](https://github.com/zodiacie/Automation/assets/57634982/0d9deb98-89f3-49bc-8e4a-fbb4ecb9fc9f)
3) Type instance "Name" in the test field
   ![image](https://github.com/zodiacie/Automation/assets/57634982/252a3d14-1d15-4037-8d09-b73acaa2e8af)
4) Go to "Image and shape" and click "Edit"
   ![image](https://github.com/zodiacie/Automation/assets/57634982/ea9755fa-be8e-4070-861e-1ff969290d47)
5) Go to click "Change Image" button
   ![image](https://github.com/zodiacie/Automation/assets/57634982/e8f60d9a-f33f-4309-b346-3bbaa893e565)
6) Choose "Ubuntu" image.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/d4d25b9f-8914-4aa8-84b2-56ccb0289647)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/2c54b137-8881-4f05-9a93-4c4ea9a52802)
7) Go to click "Change shape" button and select "Ampere" processor
   ![image](https://github.com/zodiacie/Automation/assets/57634982/9730ff8a-102e-48af-b6c2-a6dee388c4f3)
8) Choose “1 CPU” and “6 GB” memory
   ![image](https://github.com/zodiacie/Automation/assets/57634982/62358793-89d2-4d7f-ac87-054a3d4f902c)
9) Select the "Shape" setting
   ![image](https://github.com/zodiacie/Automation/assets/57634982/7da79139-a3e4-4c25-9a14-ae8ec03d88e4)
10) Save "Private Key" for Putty connection
    ![image](https://github.com/zodiacie/Automation/assets/57634982/da1afaa1-72d7-49bc-a389-b543b3910466)
    ![image](https://github.com/zodiacie/Automation/assets/57634982/f72494a6-ab6c-4db1-aadd-ff6084c6edee)
11) Click "Create" button to start instance.
    ![image](https://github.com/zodiacie/Automation/assets/57634982/41009b67-7c91-4eca-ac78-aa82936f3bc0)
12) Start "instance" running
    ![image](https://github.com/zodiacie/Automation/assets/57634982/831e0ff1-e2b4-4bd5-a457-4ed1b0d152c5)
13) Go to click "Subnet" link
    ![image](https://github.com/zodiacie/Automation/assets/57634982/cb192d9a-23cd-48b7-a161-efc0b8d8bce5)
14) Go to click "Add Ingress Rules" button
    ![image](https://github.com/zodiacie/Automation/assets/57634982/8aaca891-cf3f-4f83-9a36-80b361fddf53)
15) Add following info on "Ingress Rules" page and click "Add Ingress Rules" button
   ![image](https://github.com/zodiacie/Automation/assets/57634982/c5c8b8dd-433e-4479-9125-17ca980fe304)  
16) The Ingress Rule has been added.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/462b5640-d9de-41ed-9b44-adc79fe4ed46)

<a name = "puttysetup">Putty Setup</a>
1) Open "Putty Key Generator" tool
   ![image](https://github.com/zodiacie/Automation/assets/57634982/b5feac70-2adc-4cb4-ac9e-2bd59a4305dc)
2) Click on "Load" button and select Private Key (*.key) from instance creation.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/42c11f97-a817-49f2-a35b-a850b8c0df06)
   ![image](https://github.com/zodiacie/Automation/assets/57634982/c98244a7-46d8-4c4d-9cce-cf41a74a4c5a)
3) Go to File menu and click "Save Private Key" item.  
4) Specify a name for the key. The extension for new private key is *.ppk and click "Save" button   
5) Go to "Putty" tool and click "Host Name (IP address)" to input instance IP address.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/0fea58fb-8a63-4588-82b5-d4668fd4abef)
6) Input username@IP address in the text field.
   ![image](https://github.com/zodiacie/Automation/assets/57634982/1153b835-def9-41ba-8560-c7a9523eb5bd)
7) Go to "SSH" and "Auth" menu, and then click "Credentials".
   ![image](https://github.com/zodiacie/Automation/assets/57634982/3753abf6-fdf4-4a27-8e08-919b3e924539)
8) Go to "Private Key file for authentication:" and click "Browse..." button to select the .ppk file
   ![image](https://github.com/zodiacie/Automation/assets/57634982/73d70ef7-8440-488b-94d8-c922597e6ef3)
9) Click "Open" button to connect Oracle instance.  
10) Type following command to update APT and Install Linux RDP  
   1. "sudo apt update && sudo apt upgrade -y"  
   2. "sudo apt-get install ubuntu-desktop xrdp stacer -y"  
   3. "sudo cp /etc/iptables/rules.v4 /etc/iptables/rules.v4.bak && sudo truncate -s 0 /etc/iptables/rules.v4"  
   4. "sudo rm /usr/share/polkit-1/actions/org.freedesktop.color.policy"  
   5. "sudo passwd ubuntu" Example password: t6y1x9n6h7j1  
   6. "sudo reboot"
11) Use RDP to connect Oracle instance.  
    ![image](https://github.com/zodiacie/Automation/assets/57634982/ebd1fb9a-400d-40e1-aae8-f351a52f549b)
12) Type the created password to login.
