package com.meisterplan.example.configprops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoDataConfigTest {

    @Autowired
    private lateinit var demoDataConfig: DemoDataConfig

    @Test
    fun getFirst() {
        assertThat(demoDataConfig.first).isEqualTo("dev.example.com")
    }

    @Test
    fun getSecond() {
        assertThat(demoDataConfig.second).isEqualTo("another.example.com")
    }

    @Test
    internal fun getNested() {
        assertThat(demoDataConfig.nested.values).contains("first", "second")
    }
}