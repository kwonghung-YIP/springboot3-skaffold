package org.hung;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(controllers = {EchoController.class})
class Springboot3WebfluxApplicationTests {

	@Autowired
	private WebTestClient webClient;
	
	@ParameterizedTest
	@ValueSource(strings = {"john","peter","Mary"})
	void testEcho(String name) {
		webClient.get()
			.uri(uriBuilder -> uriBuilder.path("/echo")
					.queryParam("name", name)
					.build())
			.exchange()
			.expectStatus().isOk()
			.expectBody(String.class)
			.value(string -> assertThat(string).isEqualTo("Hello " + name));

	}

}
