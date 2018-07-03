package br.com.heiderlopes.battlecards.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport

@Configuration
class ResourceConfig : WebMvcConfigurationSupport() {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry!!
                //.addResourceHandler("/images/**")
                //.addResourceLocations("file:images/")
                .addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
    }
}