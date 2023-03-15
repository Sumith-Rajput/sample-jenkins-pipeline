node('local-mac') {
        stage('checkout') {
                git branch: 'develop', credentialsId: 'myGitID', url: 'https://github.com/Sumith-Rajput/sample-jenkins-pipeline.git'      
        stage('Test') {
                sh 'mvn clean test'
        }
        stage('Deploy') {
                echo 'Deploying....'
        }
}