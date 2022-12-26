void call(){ 
    agent('docker-agents'){
        stage("Maven build")
                {
                sh  """ 
                       mvn -version
                       ./mvnw package 
                    """
                } 
    }
}
