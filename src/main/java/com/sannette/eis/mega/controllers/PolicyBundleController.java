package com.sannette.eis.mega.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/opa/policies")
public class PolicyBundleController {

    @GetMapping("/bundles/latest")
    public Mono<String> getLatestBundle() {
        return Mono.just((String) "latest");
    }

    @GetMapping("/{version}")
    public Mono<String> getAProperty(@PathVariable String bundleName) {
        return Mono.just((String) bundleName);
    }
}
