package dev.mhodtood.${{ values.name }}

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestKafkaProjectTemplateApplication

fun main(args: Array<String>) {
	fromApplication<App>().with(TestKafkaProjectTemplateApplication::class).run(*args)
}
