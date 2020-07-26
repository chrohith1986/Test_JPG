@Library('MyLibrary') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                helloworld.info 'rohith'
            }
        }
        stage('Test') {
            steps {
                log.message 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                log.message 'Deploying....'
                helloworld.info 'sukrish'
            }
        }
    }
}
