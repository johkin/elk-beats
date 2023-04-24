package se.ansid.elk.elkbeats

import co.elastic.apm.attach.ElasticApmAttacher
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ElkBeatsApplication

fun main(args: Array<String>) {
    //ElasticApmAttacher.attach()
    runApplication<ElkBeatsApplication>(*args)
}

@RestController
class MyController {

    var logger: Logger = LoggerFactory.getLogger(MyController::class.java)

    @GetMapping("/test")
    @ResponseBody
    fun test(): String {
        logger.info("Got request!")
        return "Hello!"
    }

}