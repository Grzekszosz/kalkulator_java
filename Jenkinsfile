pipeline {
    agent any
    tools {
        maven 'mejven'
    }
    stages {
        stage("pull") {
            steps {
                git url: 'https://github.com/Grzekszosz/kalkulator_java.git', branch: 'master'
            }
        }
        stage("build") {
            steps {
                // bat 'mvn clean package'
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/*.jar'
        }
    }
}