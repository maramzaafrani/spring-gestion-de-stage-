package pistage.tn;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {


        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**") // Autoriser les requêtes CORS pour toutes les routes
                    .allowedOrigins("http://localhost:4200") // Autoriser l'origine de votre application Angular
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Autoriser les méthodes HTTP spécifiques
                    .allowedHeaders("*") // Autoriser tous les en-têtes
                    .allowCredentials(true) // Autoriser les cookies et les données d'authentification
                    .maxAge(3600); // Durée de vie du résultat de la requête préliminaire (en secondes)
        }
    }