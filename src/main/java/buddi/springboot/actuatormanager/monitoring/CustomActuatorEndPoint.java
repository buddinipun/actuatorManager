package buddi.springboot.actuatormanager.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id="custom")
@Component
public class CustomActuatorEndPoint {

    @ReadOperation
    public Map<String,String> customEndPoint() {
        Map<String,String> map = new HashMap<>();
        map.put("key","value");
        return map;
    }
}
