import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
class Server {

    // TODO

}

fun main(args: Array<String>) {
    println("launching server...")
    SpringApplication.run(Server::class.java, *args)
}