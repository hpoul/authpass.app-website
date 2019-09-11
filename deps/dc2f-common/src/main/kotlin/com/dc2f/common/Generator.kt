package com.dc2f.common

import com.fasterxml.jackson.databind.ObjectMapper
import mu.KotlinLogging
import com.fasterxml.jackson.dataformat.yaml.*
import java.io.File

private val logger = KotlinLogging.logger {}

class Generator {
}

data class Dc2fConfig(
    val contentDirectory: String,
    val staticDirectory: String,
    val setupClass: String
)

val FILE_NAME = "dc2f.yml"

fun main(): Int {
    logger.debug { "Launching generator..." }

    val configFile = File(FILE_NAME)
    if (!configFile.exists()) {
        logger.error { "Expect $FILE_NAME in current directory." }
        return 1
    }

    val config = requireNotNull(ObjectMapper(YAMLFactory()).readValue<Dc2fConfig>(configFile, Dc2fConfig::class.java))
    
    return 0
}
