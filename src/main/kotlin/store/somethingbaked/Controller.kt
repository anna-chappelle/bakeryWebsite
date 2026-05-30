package io.paketo.demo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class MyController {

    @GetMapping("/")
    fun test(): String {
        return "{}"
    }

}
