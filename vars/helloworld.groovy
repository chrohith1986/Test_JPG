def call (name) {
  
  pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Name.. ${name}'
            }
        }
        stage('Test') {
            steps {
                echo 'ttttttttttt'
            }
        }
        stage('Deploy') {
            steps {
                echo 'oooooookkkkkkkk'
            }
        }
    }
}

}
