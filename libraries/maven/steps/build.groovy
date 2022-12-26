void call(){ 
    agent('docker-agents'){
        stage("Maven: Build")
                {
                sh  """ 
                       mvn -version
                       ./mvnw package 
                    """
                } 
    }
}
