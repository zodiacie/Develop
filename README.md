#DevOps
目录: 
[Docker & Portainer](#docker) 
<a name = "docker">Docker & Portainer</a>
1) Type "sudo apt-get update" to update 
2) Type "sudo apt-get install ca-certificates curl gnupg"  
3) Type "sudo su root" to change user.  
4) Type "mkdir /etc/apt/keyrings" to create the folder   
5) Type "curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg"
6) Type echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null  
7) Type "sudo apt-get update" to update the command  
6) Type "sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin"  
7) Type "sudo apt-get update" to install  
8) Type "docker --version" to check version of docker  
9) Type "sudo apt install docker-compose" to install docker compose   
10) Type "docker-compose --version" to check of docker compose. 
11) Type "docker volume create portainer_data" to create portainer volume  
12) Type "docker run -d -p 8000:8000 -p 9000:9000 --name portainer --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer-ce:latest" to create portainer mapping.   
13) Type "sudo docker restart portainer" to restart portainer.  
14) Type "ip a" to find out instance internal ip address, usually start with inet 10.0.0.*/24 brd  
15) Go to browser and type above ip address (10.0.0.124:9000).  
16) Type password and confirm password on the Portainer login page.  
17) Type "sudo docker restart portainer" to restart portainer.  
18) Login again into the Portainer docker UI page.  
