package dev.mhodtood.${{ values.name }}.domain.example

data class KafkaPayload<T>(
    val id: String,
    val data: T
)
