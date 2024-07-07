package com.example.demo

import HelloResponse
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("hello")
class HelloController {
    @GetMapping("/world")
    fun index(model: Model): String {
        model.addAttribute("message", "Hello Kotlin")
        return "index"
    }
}

@RestController
@RequestMapping("greeter")
class GreeterController {
    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String): HelloResponse {
        return HelloResponse("hello ${name}")
    }
}