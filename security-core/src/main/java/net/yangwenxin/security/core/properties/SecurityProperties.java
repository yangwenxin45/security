package net.yangwenxin.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "yang.security")
@Data
public class SecurityProperties {

    /**
     * 浏览器环境配置
     */
    private BrowserProperties browser = new BrowserProperties();

    /**
     * 验证码配置
     */
    private ValidateCodeProperties code = new ValidateCodeProperties();

    /**
     * 社交登录配置
     */
    private SocialProperties social = new SocialProperties();

}
