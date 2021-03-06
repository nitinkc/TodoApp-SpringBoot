package com.todo.app.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nichaurasia on Sunday, December/15/2019 at 2:36 AM
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getHelloWorld(){
        String msg = "<h1>Hello!! If you see this, it means the Server is up and running</h1>";
        msg = msg + "<head> MIC TESTING...1....2....3....</head>";
        return msg;
    }

    @GetMapping("/hello-world")
    public HelloWorldBean getHelloWorldBean(){
        //throw new RuntimeException("Exception thrown");
        return new HelloWorldBean("Hello World from the Server!!!");
    }

    @GetMapping("/hello-world/{name}")
    public HelloWorldBean getHelloWorldBean(@PathVariable String name){
        //throw new RuntimeException("Exception thrown");
        return new HelloWorldBean(String.format("Hello (Path Variable) %s",name));
    }
}
