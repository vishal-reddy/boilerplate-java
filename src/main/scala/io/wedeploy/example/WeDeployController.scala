package io.wedeploy.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class WeDeployController {

    @RequestMapping(Array("/"))
    def hello(): ModelAndView = {
        return new ModelAndView("layout")
    }

}

@Configuration
@EnableAutoConfiguration
@ComponentScan
class WeDeployAppConfig

object WeDeployApplication {
    def main(args: Array[String]): Unit = {
        SpringApplication.run(classOf[WeDeployAppConfig])
    }
}