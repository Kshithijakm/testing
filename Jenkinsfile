pipeline {
    agent any

    tools {
        // Ensure this matches the name in Manage Jenkins -> Tools -> Maven
        maven 'maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                // This pulls the code using the URL you configured in the Jenkins Job UI
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Use 'bat' for Windows environments
                bat 'mvn clean compile'
            }
        }

        stage('JUnit Test') {
            steps {
                // This runs the tests found in src/test/java
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            // This captures the test results and displays them in Jenkins
            junit '**/target/surefire-reports/*.xml'
        }
        success {
            echo 'Build and Tests passed successfully!'
        }
        failure {
            echo 'Build or Tests failed. Check the Console Output.'
        }
    }
}
