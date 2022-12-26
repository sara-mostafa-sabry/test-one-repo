void call(){
    node{
    stage("Maven: Build")
                {   
                sh  """ mvn -version
                    ./mvnw package 
                    """
                }
}
}
