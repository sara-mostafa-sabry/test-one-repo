void call(){
	sh "docker build -t petclinic:v$BUILD_NUMBER ."
}
