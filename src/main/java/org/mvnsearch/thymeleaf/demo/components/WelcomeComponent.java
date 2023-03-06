package org.mvnsearch.thymeleaf.demo.components;

import de.tschuehly.thymeleafviewcomponent.ViewComponent;
import de.tschuehly.thymeleafviewcomponent.ViewContext;
import de.tschuehly.thymeleafviewcomponent.ViewProperty;

@ViewComponent
public class WelcomeComponent {
    public ViewContext render() {
        return new ViewContext(
                ViewProperty.of("user", "Admin")
        );
    }
}
