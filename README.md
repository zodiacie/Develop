#DevOps  
目录:  
[Docker](#docker)  
[Jenkins](#jenkins)  
[Ansible](#ansible)  
[Gitlab](#gitlab)  


<a name = "docker">Docker + Portainer</a>  
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



<a name = "jenkins">Jenkins</a>
1) Use Portainer to start Jenkins container
2) Type "sudo docker run --detach --name jenkins -p 50000:50000 -p 8080:8080 \
    -v /var/run/docker.sock:/var/run/docker.sock \
    jenkins/jenkins:latest"
2) Type "IP Address:8080" in the browser to start Jenkins
3) Type "docker exec -u 0 -it jenkins(container name) /bin/bash" in terminal to login as docker root user.
4) Type "exit" to quit docker root user.
4) Go to "/var/jenkins_home/secrets/initialAdminPassword" to get password.
5) Paste password and click on "Sugguest Plugins" to setup Jenkins. Usually Username: admin, Password: Zxcv!23456


<a name = "ansible">Ansible</a>
1) sudo apt-add-repository ppa:ansible/ansible
2) sudo apt update
3) sudo apt install ansible
4) ansible --version to check if it's installed correctly.


<a name = "gitlab">Gitlab</a>
1) VMWare Requirements: 4G RAM, 2 Core Processor
2) Create gitlab folder under srv folder (mkdir /srv/gitlab) and Type "export GITLAB_HOME=/srv/gitlab" to create gitlab home.
3) Type "sudo docker run --detach \
  --hostname gitlab.example.com \
  --publish 1443:443 --publish 81:80 --publish 220:22 \
  --name gitlab \
  --restart always \
  --volume $GITLAB_HOME/config:/etc/gitlab \
  --volume $GITLAB_HOME/logs:/var/log/gitlab \
  --volume $GITLAB_HOME/data:/var/opt/gitlab \
  --shm-size 2gb \
  gitlab/gitlab-ce:latest" to create gitlab container.
1) Use Portainer to pull yrzr/gitlab-ce-arm64v8:latest(it's for ARM64 cpu) image
2) Add container from Portainer and start the container.
4) Go to browser and type IP address like 192.168.X.X:81 to start Gitlab
5) Go to terminal and type "docker exec -it gitlab(container name) /bin/bash" to login as docker root user.
6) Go to "cat /etc/gitlab/initial_root_password" file to copy temp password and login as "root" user.
7) Go to "apt-get update" and "apt-get install nano" to install nano command in gitlab container.
8) Go to "nano /etc/gitlab/gitlab.rb" file to edit "external url" (must be public internet address, can't use 192.168.X.X internal IP address, it's at top of the file) and ssh port (gitlab_rails['gitlab_ssh_host'] = must be external internet address, can't use internal IP address like '192.168.XX.XX' and gitlab_rails['gitlab_shell_ssh_port'] = 22).
9) Type "external_url like "http://172.02.X.X"" to config external url
10) Type "gitlab-ctl reconfigure" to reconfig docker.
11) Type "exit" to quit docker root user.
12) Install GIT on ubuntu - "sudo apt-get update", and then "sudo apt install git-all" 

Setup Connection between VSCode and Gitlab
1) Type "sudo apt-get update" and "sudo apt-get install git" to install git in the local laptop
2) Type "sudo apt-get install git-gui" to install gui interface for git and type "git gui" to start git gui interface.
3) Go to VSCode and Terminal console.
4) Under project folder, type "git init" to make the project folder as git repository folder.
5) Type "git config --global user.email 'test@test.com'" and "git config --global user.name "tester"" to config user info.
6) Type "git add ." to submit all updated files
7) Type "git commit -m "message info"" to commit uploaded files.
8) Type "git config --get remote.origin.url" to check GIT url details.
9) Type "git remote set-url origin git@github.com:zodiacie/Testing.git" to setup Git SSH url.
8) Type "ssh-keygen -t rsa -C "test@test.com"" to generate ssh key fot Github or Gitlab connection.
9) Go to "/root/.ssh/" and type "cat id-rsa.pub" to display and copy the public key.
10) Paste the public key in gitlab "ssh keys" page (under account -> preferences page) and save by clicking "add key".
11) Better to log off and log in again.
12) Type "git remote set-url origin http://[localhost address]:[port]/root/mavenproject.git" add gitlab url (this is for HTTP connection. Example: git remote set-url origin http://192.168.111.134:81/root/testing.git)
13) Type "git remote set-url origin ssh://git@[localhost address]:[port]/root/mavenproject.git" add gitlab url (this is for SSH connection with id_rsa.pub ssh key, no need username and password during push branch. Example: git remote set-url origin ssh://git@192.168.111.134:220/root/testing.git which will be added into /.ssh/known_host file for the first time setup.)
13) Type "git push -u origin main(main is branch name)" to upload the code from git to gitlab.
14) Type "git clone http://172.17.0.4/root/mavenproject.git" to download code folders from gitlab to local folder.
15) Type "git push -u origin main" to push 
