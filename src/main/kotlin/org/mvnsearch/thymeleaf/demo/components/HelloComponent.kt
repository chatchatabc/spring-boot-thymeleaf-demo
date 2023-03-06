package org.mvnsearch.thymeleaf.demo.components

import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.ViewProperty

@ViewComponent
class HelloComponent {
    fun render(): ViewContext {
        return ViewContext("HelloComponent", ViewProperty("user", "Admin"))
    }
}