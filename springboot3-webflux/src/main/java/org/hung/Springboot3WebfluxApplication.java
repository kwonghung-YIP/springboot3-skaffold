package org.hung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Springboot3WebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3WebfluxApplication.class, args);
	}

}

@RestController
class EchoController {

	@GetMapping("/echo")
	public String echo(@RequestParam String name) {
		return "Hello " + name;
	}
}