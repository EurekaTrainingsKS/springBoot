package com.stocks.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //REST API's these communication Synconrous
    //Sync and Async
    //REST and Kafka, pub-sub calls
    //All these GET, POST, PUT , DELET, PATCH are https methods
    //GET => readData, POST => CreateSomething, PUT => Replace something as Whole, DELETE => deleteSomething, PATCH => Replace a small bit
    //these calls will have status codes
    //mode of DataTransfer, which can be xml or json format, we use JSON format
    @GetMapping(value = "/helloWorld")
    public String firstWebMethod(){
        return "Hello World!, this is my 1st webMethod";
    }

    //we can pass data to server in many ways
    //1=> path params
    //2=> request params or qurey
    //3=> sending in body, format we use is JSON

    // path params
    @GetMapping("/helloWorld/{name}")
    public String secondWebMethod(@PathVariable(value = "name") String name){
        return "HelloWorld! , My name is "+name;
    }
    //Request Params
    @GetMapping("/helloWorldRequest")
    public String thirdWebMethod(@RequestParam(value = "firstName") String firstName,
                                 @RequestParam(value = "secondName") String secondName){
        return "HelloWorld! My name is "+firstName+" "+secondName;
    }
}
