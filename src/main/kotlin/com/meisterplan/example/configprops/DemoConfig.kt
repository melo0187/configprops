package com.meisterplan.example.configprops

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "my.settings")
class DemoConfig {
    lateinit var first: String
    lateinit var second: String
    lateinit var nested: Map<String, String>
}