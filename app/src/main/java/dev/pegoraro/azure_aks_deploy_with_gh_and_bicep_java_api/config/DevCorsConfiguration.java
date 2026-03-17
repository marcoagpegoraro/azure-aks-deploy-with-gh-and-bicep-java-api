package dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@Profile("dev")
public class DevCorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Apply to all endpoints
                .allowedOrigins("http://localhost:5173") // Allow all origins (use with caution, only in dev)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow common methods
                .allowedHeaders("*"); // Allow all headers
    }
}