pipeline{
    agent any
    tools
    {
        maven 'Maven 3.8.6'
    }
    stages
    {
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kondurusathish/SpringbootDevops']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image')
        {
            steps{
                script{
                    bat 'docker build -t practice/devops-automation '
                }
            }
        }

        stage('push image to docker hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    bat 'docker login -u ksraju1706 -p ${dockerhubpwd}'
                    bat 'docker push practice/devops-automation'
                }
                }

            }
        }
    }
}