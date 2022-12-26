void call(){  
        step("build")
                {
                sh  """ 
                       mvn -version
                       ./mvnw package 
                    """
                } 
}
