package com.allen.cmsshoppingcart;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // @Override
    // public void addViewControllers(ViewControllerRegistry registry) {
    // registry.addViewController("/").setViewName("home");
    // }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/media/**")
                .addResourceLocations(
                        "file:/D:/Java/shoppingcart project/cmsshoppingcart/src/main/resources/static/media/");
        // D:\Java\shoppingcart project\cmsshoppingcart\src\main\resources\static
    }
}
