void call(){

    stage('Build docker image') {
            steps {

                 sh "docker build -t petclinic:v$BUILD_NUMBER . "

            }
        }

    stage('Docker deploy')  {
             steps {

                 sh "docker run -d -p 8000:8080 -e JAVA_OPTS='-Xms256MB -Xmx512MB' --name java-app petclinic:v$BUILD_NUMBER"

            }
        }

}
