pipeline {
    agent any

    tools {
        // Matches the name you set in Manage Jenkins -> Tools
        maven 'maven3'
    }

    stages {
        stage('Build') {
            steps {
                // Compile the code first
                bat 'mvn clean compile'
            }
        }

        stage('JUnit Test') {
            steps {
                // Run the actual tests
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            // Tells Jenkins where to find the test results to display the graph
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
