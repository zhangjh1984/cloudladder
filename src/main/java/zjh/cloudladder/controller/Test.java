package zjh.cloudladder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class Test {
	@RequestMapping(value = "mono", method = RequestMethod.GET)
    public Mono<String> hello1() {
        return Mono.just("hello mono");
    }
	
	@GetMapping("/flux")
    public Flux<String> hello2() {
        return Flux.just("hello flux");
    }
}
