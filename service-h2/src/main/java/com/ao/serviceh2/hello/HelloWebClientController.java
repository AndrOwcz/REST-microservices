package com.ao.serviceh2.hello;

//import com.ao.serviceh2.kafka.Receiver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWebClientController {

    private final RestTemplate restTemplate;
    private final HelloRepository helloRepository;

    public HelloWebClientController(RestTemplate restTemplate, HelloRepository helloRepository) {
        this.restTemplate = restTemplate;
        this.helloRepository = helloRepository;
    }

    @GetMapping("/")
    public String handleRequest() {
        HelloEntity helloEntityObject = restTemplate.getForObject("http://hello-service/hello", HelloEntity.class);
        assert helloEntityObject != null;
        helloRepository.save(helloEntityObject);
        return helloEntityObject.getMessage();
    }
}
