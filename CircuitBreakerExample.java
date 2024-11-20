package backoffice;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;

import java.time.Duration;
import java.util.function.Supplier;

public class CircuitBreakerExample {
    public static void main(String[] args) {
        // Create a custom configuration for a CircuitBreaker
        CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                .failureRateThreshold(50)
                .waitDurationInOpenState(Duration.ofMillis(1000))
                .slidingWindowSize(2)
                .build();

        // Create a CircuitBreakerRegistry with a custom global configuration
        CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.of(circuitBreakerConfig);

        // Get or create a CircuitBreaker from the CircuitBreakerRegistry
        CircuitBreaker circuitBreaker = circuitBreakerRegistry.circuitBreaker("myCircuitBreaker");

        // Decorate your call to a remote service with a CircuitBreaker
        Supplier<String> decoratedSupplier = CircuitBreaker.decorateSupplier(circuitBreaker, CircuitBreakerExample::remoteServiceCall);

        // Execute the decorated supplier and recover from any exception
        try {
            String result = decoratedSupplier.get();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Service call failed: " + e.getMessage());
        }
    }

    private static String remoteServiceCall() {
        // Simulate a remote service call that might fail
        if (Math.random() > 0.5) {
            throw new RuntimeException("Service failed");
        }
        return "Service response";
    }
}

