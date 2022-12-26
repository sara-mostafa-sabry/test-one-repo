void call(){  
        stage("build")
                {
                sh  """ 
                       mvn -version
                       ./mvnw package 
                    """
                } 
}
