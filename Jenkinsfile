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

    }

}