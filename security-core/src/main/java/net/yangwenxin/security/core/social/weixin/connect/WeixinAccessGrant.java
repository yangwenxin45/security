package net.yangwenxin.security.core.social.weixin.connect;

import lombok.Getter;
import lombok.Setter;
import org.springframework.social.oauth2.AccessGrant;

import java.io.Serializable;

@Getter
@Setter
public class WeixinAccessGrant extends AccessGrant implements Serializable {


    private static final long serialVersionUID = -3195383499277944852L;

    private String openId;

    public WeixinAccessGrant() {
        super("");
    }

    public WeixinAccessGrant(String accessToken, String scope, String refreshToken, Long expiresIn) {
        super(accessToken, scope, refreshToken, expiresIn);
    }
}
