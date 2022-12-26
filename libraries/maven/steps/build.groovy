void call(){  
        stage("Maven build")
                {
                sh  """ 
                       mvn -version
                       ./mvnw package 
                    """
                } 
}
