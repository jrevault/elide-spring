package example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@Data
@ConfigurationProperties(prefix = "elide")
@ComponentScan
public class ElideSettings {
    private ControllerConfig jsonApi;
    private ControllerConfig graphql;
}
