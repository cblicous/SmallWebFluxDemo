### Simple Project to take a peek into WebFlux


### Debug with 
gradle bootRun --debug-jvm

### Send Message 

Post http://localhost:8080/author/sendMessage

Content-Type : application/json

{
	"authorId": "01",
	"message": "Test"
}