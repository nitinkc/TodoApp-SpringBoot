# TodoApp-SpringBoot

To allow connections from Angular app, use @CrossOrigin annotation to allow the incoming request

```java
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world/{name}")
    public HelloWorldBean getHelloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello %s",name));
    }
}
```