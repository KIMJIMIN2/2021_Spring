package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
    public String Hello() {
        return "get Hello";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET) // method 옵션을 명시하지 않으면 get, post, put, delete 모두 적용됨
    public String hi() {
        return "hi";
    }

    //  http://localhost:9090/api/get/path-variable/{spring-boot}

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : "+pathName);
        return pathName;
    }
}
