def call(name_org) {
  
  pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Name ---- ${name_org}"
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
