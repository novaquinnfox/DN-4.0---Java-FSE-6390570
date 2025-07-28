package com.cognizant.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class springlearn {
   
        @GetMapping("/hello")
        public  String sayHello(){
            return "Hello I'm Spring Web Project";
        }
   }

