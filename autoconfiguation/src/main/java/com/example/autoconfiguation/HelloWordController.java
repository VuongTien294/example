package com.example.autoconfiguation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hello")
    public HelloWorld showHelloWorldString(){
        HelloWorld helloWorld = HelloWorld.builder()
                .word1("Word 1")
                .word2("Word 2")
                .build();

        return helloWorld;
    }
}
