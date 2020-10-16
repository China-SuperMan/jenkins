package com.example.jenkins;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    public String aaa(){
        return  "hello jenkins 测试就Jenkins持续集成！";
    }
}
