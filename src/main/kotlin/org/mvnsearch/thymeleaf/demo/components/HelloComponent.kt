package org.mvnsearch.thymeleaf.demo.components

import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext

@ViewComponent
class HelloComponent {
    fun render(): ViewComponentContext {
        return ViewComponentContext("HelloComponent", Pair("user", "Admin"))
    }
}