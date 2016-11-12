package io.wedeploy.example

import kotlin.jvm.JvmStatic

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@EnableAutoConfiguration
class WeDeployController {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(WeDeployController::class.java, *args)
        }
    }

    @RequestMapping("/")
    fun hello(): ModelAndView {
        return ModelAndView("layout")
    }

}