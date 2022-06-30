package com.portfolio.MyPortfolio8;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class MyPortfolio8Application {

	public static void main(String[] args) {
		SpringApplication.run(MyPortfolio8Application.class, args);
	}
        
        //https://portfolio-argentina-prog-f5593.web.app
        //http://localhost:4200
        
        
        /*@Bean //Sandra
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Arrays.asList("https://portfolio-argentina-prog-f5593.web.app"));
        config.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "content-type", "Accept",
                "Authorization", "Origin, Accept", "x-auth-token"));
        config.setExposedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "content-type", "Accept",
                "Authorization", "Origin, Accept", "x-auth-token"));
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
*/
 @Bean
public CorsFilter corsFilter() {
CorsConfiguration corsConfiguration = new CorsConfiguration();
corsConfiguration.setAllowCredentials(true);
corsConfiguration.setAllowedOrigins(Arrays.asList("https://portfolio-argentina-prog-f5593.web.app"));//
corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
"Accept", "Authorization", "Origin, Accept", "X-Request-With",
"Access-Control-Request-Method", "Access-Control-Request-Headers"));
corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-type", "Accept", "Authorization",
"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
corsConfiguration.setAllowedMethods(Arrays.asList("GET", "PUT", "POST", "DELETE", "OPTIONS"));
UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
return new CorsFilter(urlBasedCorsConfigurationSource);
}

}
