package com.example.githubactionsgke

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public fun helloWord(): String {
        return "Hello World";
    }
}
