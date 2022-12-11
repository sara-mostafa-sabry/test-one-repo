pipeline {
    agent {label 'On-demand-agents'}  
    
    stages {
    
        stage('Maven build') { 
            
            environment {
            MAVEN_OPTS="-Xmx1024m -XX:MaxPermSize=128m"
            }
            
            steps {
               
                  sh """
                       java -version 
                       wget https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
                       tar xvf apache-maven-3.8.6-bin.tar.gz
                       mv apache-maven-3.8.6 /opt/maven
                       echo "export JAVA_HOME=/opt/java/openjdk" > /etc/profile.d/maven.sh
                       echo "export M2_HOME=/opt/maven" >> /etc/profile.d/maven.sh
                       echo "export PATH=${M2_HOME}/bin:${PATH}" >> /etc/profile.d/maven.sh
                       source /etc/profile.d/maven.sh
                       mvn -version
                     """
                
                }    

        }        
        
        stage('Docker build') {
            steps {
                    
                 sh "docker build -t petclinic:v$BUILD_NUMBER ."

            }
        }
        
        stage('Docker deploy')  {
             steps {
                    
                 sh "docker run -d -p 8000:8080 -e JAVA_OPTS='-Xms256MB -Xmx512MB' --name java-app petclinic:v$BUILD_NUMBER"

            }
        }
       
    }
}
