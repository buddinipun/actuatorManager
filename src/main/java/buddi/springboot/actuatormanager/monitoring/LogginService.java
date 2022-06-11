package buddi.springboot.actuatormanager.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LogginService  implements HealthIndicator {

    private final String LOGGER_SERVICE = "Logger Service";
    @Override
    public Health health() {
        if(isLoggerServiceGood()) {
            return Health.up().withDetail(LOGGER_SERVICE, "Service is Running").build();
        }
            return Health.up().withDetail(LOGGER_SERVICE,"Service is not available").build();
    }

    private boolean isLoggerServiceGood() {
        //logic
        return false;
    }
}
