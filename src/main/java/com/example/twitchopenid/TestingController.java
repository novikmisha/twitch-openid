package com.example.twitchopenid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestingController {
    @GetMapping("/")
    public Principal getPrincipal(Principal principal) {
        return principal;
    }
}
