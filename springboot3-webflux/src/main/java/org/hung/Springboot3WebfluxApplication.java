package org.hung;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class Springboot3WebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3WebfluxApplication.class, args);
	}

}

@Slf4j
@RestController
class EchoController {

	@GetMapping("/echo")
	public String echo(@RequestParam String name) {
		String hostname;
		try {
			hostname = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			hostname = "unknown";
		}
		log.info("{}:incoming request form {}",hostname,name);
		return "Hello " + name;
	}
}