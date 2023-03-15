node('local-mac') {
    stages {
        stage('checkout') {
            steps{
                git branch: 'develop', credentialsId: 'myGitID', url: 'https://github.com/Sumith-Rajput/sample-jenkins-pipeline.git'
            }      
        }
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}