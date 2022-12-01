pipeline {
    agent {label 'Agent'}  
    
    stages {
    
        stage('CI') {
            steps {
                    
                withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) { 
                
                sh """
                    
                    docker build -t saraamostafa/my-private-repo:$BUILD_NUMBER .
                    docker login -u ${USERNAME} -p ${PASSWORD}
                    docker push saraamostafa/my-private-repo:$BUILD_NUMBER

                """
                
        
        stage('CD') {
            steps {
                
                 sh "docker run -d -p 8000:8080 -e JAVA_OPTS='-Xms256MB -Xmx512MB' --name java-app saraamostafa/my-private-repo:$BUILD_NUMBER"
            }
        }         
    }
}