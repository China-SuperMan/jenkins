package com.example.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @RequestMapping("a")
    public String aaa(){
        return  "hello jenkins 测试Jenkins持续集成！";
    }
}
