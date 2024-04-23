package gatewayapi.gatewayapi.routing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.RouteLocatorBuilder;

@Configuration
public class RouteConfiguration {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org")
                )
                .route(p -> p
                        .host("*.ebac.com.br")
                        .filters(f -> f.addRequestHeader("Hello", "Site da Ebac"))
                        .uri("http://httpbin.org")
                )
                .build();
    }

    }
}
