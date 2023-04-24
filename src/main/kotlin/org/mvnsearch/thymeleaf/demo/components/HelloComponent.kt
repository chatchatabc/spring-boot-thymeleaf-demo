package org.mvnsearch.thymeleaf.demo.components

import de.tschuehly.spring.viewcomponent.core.ViewComponent
import de.tschuehly.spring.viewcomponent.core.ViewContext
import de.tschuehly.spring.viewcomponent.core.ViewProperty

@ViewComponent
class HelloComponent {
    fun render(): ViewContext {
        return ViewContext("HelloComponent", ViewProperty("user", "Admin"))
    }
}