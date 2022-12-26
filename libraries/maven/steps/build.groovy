void call(){
    node{
    stage("Maven: Build")
        { 
                sh  """
                    java -version
                    mvn -version
                    ./mvnw package 
                    """
                }
}
}
