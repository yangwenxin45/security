package net.yangwenxin.security.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.social.SocialProperties;

@Getter
@Setter
public class QQProperties extends SocialProperties {

    private String providerId = "qq";

}
