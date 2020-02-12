package com.meisterplan.example.configprops

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "my.datasettings")
data class DemoDataConfig(
    val first: String,
    val second: String,
    val nested: Map<String, String>
)