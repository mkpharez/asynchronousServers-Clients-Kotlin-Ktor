package com.example.plugins

import com.example.routes.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()

        with(CustomerRoutes()){
            customerRouting()
        }
    }
}