package store.somethingbaked.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins(
                "https://bakerywebsitefrontend-production.up.railway.app/"
            )
            .allowedMethods("*")
            .allowedHeaders("*")
    }
}
