pipeline {
    agent any

    stages {
        stage('CheckOut') {
            steps {
                echo 'pull from git hub'
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'Github', url: 'https://github.com/55TFSI/LearnBoot.git']]])
            }
        }
        stage('Build') {
            steps {
                build 'LearnBootCI'
            }
        }
    }
}