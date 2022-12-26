void call(){
    agent {label 'docker-agents'}  {
    stage("Maven: Build")
                {   
                sh  """ mvn -version
                    ./mvnw package 
                    """
                }
}
}
