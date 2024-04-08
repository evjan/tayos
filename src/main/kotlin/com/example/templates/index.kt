package com.example.templates

import kotlinx.html.*

fun HTML.index() {
    head {
        script {
            src = "https://unpkg.com/htmx.org@1.9.11"
        }
    }
    body {
        home()
    }

}

fun FlowContent.home() = div {
    button {
        +"Hi"
    }
}
