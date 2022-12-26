void call(){ 
    agent {label 'docker-agents'}  
        stage("Maven build")
                {
                sh  """ 
                       mvn -version
                       ./mvnw package 
                    """
                } 
}
