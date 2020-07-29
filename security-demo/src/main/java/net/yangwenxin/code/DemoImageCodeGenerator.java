package net.yangwenxin.code;

import net.yangwenxin.security.core.validate.code.ValidateCodeGenerator;
import net.yangwenxin.security.core.validate.code.image.ImageCode;
import org.springframework.web.context.request.ServletWebRequest;

//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("更高级的图形验证码生成代码");
        return null;
    }

}
