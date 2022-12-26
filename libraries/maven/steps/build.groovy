void call(){
    stage("Maven: Build"){
        steps {
                  sh "
                       ./mvnw package
                     "

                }
        }
}
