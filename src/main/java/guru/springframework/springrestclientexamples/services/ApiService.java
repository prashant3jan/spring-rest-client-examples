package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface ApiService {
    List<User> getUsers(Integer Limit);
    Flux<User> getUsers(Mono<Integer> limit) throws ExecutionException, InterruptedException;
}
