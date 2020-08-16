package net.yangwenxin.security.core.social.weixin.config;

import net.yangwenxin.security.core.properties.SecurityProperties;
import net.yangwenxin.security.core.properties.WeixinProperties;
import net.yangwenxin.security.core.social.weixin.connect.WeixinConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.social.SocialAutoConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.ConnectionFactory;

@Configuration
@ConditionalOnProperty(prefix = "yang.security.social.weixin", name = "app-id")
public class WeixinAutoConfiguration extends SocialAutoConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    protected ConnectionFactory<?> createConnectionFactory() {
        WeixinProperties weixinConfig = securityProperties.getSocial().getWeixin();
        return new WeixinConnectionFactory(weixinConfig.getProviderId(), weixinConfig.getAppId(),
                weixinConfig.getAppSecret());
    }
}
