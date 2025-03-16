pipeline {
    agent any
    stages {
        stage('构建') {
            steps {
                echo "正在构建项目"
            }
        }
        stage('测试') {
            steps {
                echo "正在运行测试"
            }
        }
        stage('部署') {
            steps {
                echo "正在部署到生产环境"
            }
        }
    }
}
