package com.meisterplan.example.configprops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoConfigTest {

    @Autowired
    private lateinit var demoConfig: DemoConfig

    @Test
    fun getFirst() {
        assertThat(demoConfig.first).isEqualTo("dev.example.com")
    }

    @Test
    fun getSecond() {
        assertThat(demoConfig.second).isEqualTo("another.example.com")
    }

    @Test
    internal fun getNested() {
        assertThat(demoConfig.nested.values).contains("first", "second")
    }
}