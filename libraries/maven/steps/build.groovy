void call(){
    node{
    stage("Maven: Build")
                { 
                sh  " ./mvnw package "
                }
}
}
