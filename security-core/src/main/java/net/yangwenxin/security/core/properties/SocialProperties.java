package net.yangwenxin.security.core.properties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SocialProperties {

    private QQProperties qq = new QQProperties();

    private String filterProcessesUrl = "/auth";

}
