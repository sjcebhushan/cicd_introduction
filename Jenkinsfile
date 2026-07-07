pipeline {
    agent any
    stages {
        stage('Checkout'){
            steps {
                checkout scm
            }
        }

        stage('Build'){
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew clean build'
            }
        }

        stage('Docker Build'){
            steps {
                sh '''
                docker stop spring-app || true
                docker rm spring-app || true
                docker run -d --name spring-app -p 8080:8080 springboot-devsecops:v1
                '''
            }
        }
    }
}