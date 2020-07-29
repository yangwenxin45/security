package net.yangwenxin.security.core.properties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();

    private SmsCodeProperties sms = new SmsCodeProperties();

}
