package com.example.plugins

import com.example.templates.index
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.html.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondHtml(HttpStatusCode.OK) {
                index()
            }
        }
    }
}
