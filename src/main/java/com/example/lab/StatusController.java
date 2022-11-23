package com.example.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {

    // constructor injection
//    private final StatusService statusService;
//
//    public StatusController(StatusService statusService) {
//        this.statusService = statusService;
//    }

    // field injection
    @Autowired
    StatusService statusService;

    @GetMapping("/arrival")
    public String sayHello() {
        return statusService.processStatus(true);
    }

    @GetMapping("/departure")
    public String sayGoodbye() {
        return statusService.processStatus(false);

    }
}