package org.yggd.backendfrontenddemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VueController {

    @GetMapping("/hello")
    fun hello() : User = User("1234", "taro")
}
