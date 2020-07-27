def call() {
  
  pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Name ---- ${name}"
            }
        }
        stage('Test') {
            steps {
                echo '------------- TEST ------------'
            }
        }
    }
}

}
