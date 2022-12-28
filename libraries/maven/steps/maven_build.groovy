void call(){
	sh """
		mvn -version
		./mvnw package
	"""
}
