package guru.springframework.springrestclientexamples.controllers;

import guru.springframework.springrestclientexamples.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Value("${rest.url}")
    public String restUrl;
//    @Autowired
//    ApplicationContext applicationContext;

    WebTestClient webTestClient;

//    @Before
//    public void setUp() throws Exception {
//        webTestClient = WebTestClient.bindToApplicationContext(applicationContext).build();
//    }

    @Test
    public void index() throws URISyntaxException {
        webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();

        webTestClient.get().uri(new URI("http://localhost:3000"))
                .exchange()
                .expectStatus().isOk();
    }

    @Test
    public void formPost() throws URISyntaxException {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("limit", "1");

        webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();

        webTestClient.post().uri(new URI("http://localhost:3000/users"))
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromFormData(formData))
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBodyList(User.class);

    }

}