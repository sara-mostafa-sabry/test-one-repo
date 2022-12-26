void call(build){  
        stage("Maven build")
                {
                sh  """ 
                       mvn -version
                       ./mvnw package 
                    """
                } 
}
