pipeline {
    agent any

    triggers {
        cron('H H * * 0') // Every 7 days (Sunday)
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/umeshparthipan/ci-cd-umesh/'
            }
        }

    }

}