package com.example.demo

import HelloRequest
import HelloResponse
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

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

    @GetMapping("/hello/{name}")
    fun helloPathValue(@PathVariable("name") name: String): HelloResponse {
        return HelloResponse("Hello $name")
    }

    @PostMapping("/hello")
    fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
        return HelloResponse("Hello ${request.name}")
    }
}