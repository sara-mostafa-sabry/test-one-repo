void call(){
    stage("Maven: Build"){
        steps {
                  sh """
                       java -version
                       mvn -version
                       ./mvnw package
                     """

                }
        }
}
