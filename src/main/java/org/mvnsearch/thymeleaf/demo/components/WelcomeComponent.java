package org.mvnsearch.thymeleaf.demo.components;

import de.tschuehly.spring.viewcomponent.core.ViewComponent;
import de.tschuehly.spring.viewcomponent.core.ViewContext;
import de.tschuehly.spring.viewcomponent.core.ViewProperty;

@ViewComponent
public class WelcomeComponent {
    public ViewContext render() {
        return new ViewContext(
                ViewProperty.of("user", "Admin")
        );
    }
}
