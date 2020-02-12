package com.meisterplan.example.configprops

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@SpringBootApplication
@ConfigurationPropertiesScan
class ConfigpropsApplication

fun main(args: Array<String>) {
    runApplication<ConfigpropsApplication>(*args)
}

@Component
class PropertiesValidator(private val demoConfig: DemoConfig, private val demoDataConfig: DemoDataConfig) {
    val log = LoggerFactory.getLogger(PropertiesValidator::class.java)

    @PostConstruct
    fun init() {
        log.info("demoConfig: ${demoConfig.first}, ${demoConfig.second}, ${demoConfig.nested}")
        log.info("demoDataConfig: $demoDataConfig")

        //you can (this will break DemoConfigTest):
        //demoConfig.first = "test"
        //you can't do the following due to demoDataConfig being immutable.
        //demoDataConfig.first = "test"
    }
}
