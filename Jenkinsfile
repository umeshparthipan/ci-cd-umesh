pipeline {
    agent any

    triggers {
        cron('H H * * 0') // Every 7 days (Sunday)
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/umeshparthipan/ci-cd-umesh/'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/test-output/*.xml'
        }
    }
}