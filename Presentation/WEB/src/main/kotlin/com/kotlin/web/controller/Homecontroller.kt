package com.kotlin.web.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController(){

    /*@Autowired
    lateinit var mainService: MainService*/

    @GetMapping("/")
    fun main(model: Model):String{
        System.out.println("Hello Home Controller _ main()")

      /*  var cnt: Int = mainService.getListCnt()
        model["cnt"] = cnt
*/
        return "main"
    }
}