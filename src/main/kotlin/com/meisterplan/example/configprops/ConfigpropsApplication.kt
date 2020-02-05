package com.meisterplan.example.configprops

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class ConfigpropsApplication

fun main(args: Array<String>) {
	runApplication<ConfigpropsApplication>(*args)
}
