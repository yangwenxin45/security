package net.yangwenxin.security.core.social.weixin.connect;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.yangwenxin.security.core.social.weixin.api.Weixin;
import net.yangwenxin.security.core.social.weixin.api.WeixinUserInfo;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

@NoArgsConstructor
@AllArgsConstructor
public class WeixinAdapter implements ApiAdapter<Weixin> {

    private String openId;


    @Override
    public boolean test(Weixin weixin) {
        return true;
    }

    @Override
    public void setConnectionValues(Weixin api, ConnectionValues connectionValues) {
        WeixinUserInfo profile = api.getUserInfo(openId);
        connectionValues.setProviderUserId(profile.getOpenId());
        connectionValues.setDisplayName(profile.getNickname());
        connectionValues.setImageUrl(profile.getHeadimgurl());

    }

    @Override
    public UserProfile fetchUserProfile(Weixin weixin) {
        return null;
    }

    @Override
    public void updateStatus(Weixin weixin, String s) {

    }
}
