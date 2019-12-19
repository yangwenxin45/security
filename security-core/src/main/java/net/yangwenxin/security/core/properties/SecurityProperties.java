package net.yangwenxin.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "yangwenxin.security")
@Data
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

}
