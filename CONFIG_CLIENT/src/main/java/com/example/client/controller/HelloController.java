package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author zhipeng.han@luckincoffee.com
 * @date 2020/4/22 16:42
 * @description :
 */
@RestController
public class HelloController {

    @Value("${neo.profile}")
    private String profile;

    @GetMapping("/info")
    private Mono<String> getInfo(){
        return Mono.justOrEmpty(profile);
    }
}
