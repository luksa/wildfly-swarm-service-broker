package org.wildfly.swarm.osbapi.tokenservice;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

/**
 * The health check for the JWTService
 */
@Health
@ApplicationScoped
public class HealthEndpoint implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("jwt-service-broker-check")
                .up()
                .build();
    }
}
