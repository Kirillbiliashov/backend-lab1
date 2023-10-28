package com.example.plugins

import com.example.model.HealthcheckResponseBody
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.net.http.HttpResponse
import java.time.LocalDateTime

fun Application.configureRouting() {
    routing {
        get("/healthcheck") {
            val currTime = LocalDateTime.now().toString()
            val serviceResponse = HttpStatusCode.OK
            call.respond(HealthcheckResponseBody(
                currTime,
                serviceResponse.value
            ))
        }
    }
}
