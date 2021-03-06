package net.yangwenxin.security.core.validate.code.image;

import lombok.Getter;
import lombok.Setter;
import net.yangwenxin.security.core.validate.code.ValidateCode;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

@Setter
@Getter
public class ImageCode extends ValidateCode {

    /**
     * 图片
     */
    private BufferedImage image;

    public ImageCode(BufferedImage image, String code, int expireIn) {
        super(code, expireIn);
        this.image = image;
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime expireIn) {
        super(code, expireIn);
        this.image = image;
    }

}
