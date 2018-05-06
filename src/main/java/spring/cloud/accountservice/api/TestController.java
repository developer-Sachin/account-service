package spring.cloud.accountservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.accountservice.exceptions.HelloMessageNotFoundException;

public class TestController {
    @RestController
    @RequestMapping("/api/")
    public static class HelloController {

        @GetMapping("/sayHello")
        public String sayHello(){
            return "say Hello";
        }

        @GetMapping("/throw-404")
        public String throw404Exp() throws HelloMessageNotFoundException {

           throw new HelloMessageNotFoundException("Hello Message Not Found");
        }


    }
}
