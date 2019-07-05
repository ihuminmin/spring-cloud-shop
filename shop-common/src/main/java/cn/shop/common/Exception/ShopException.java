package cn.shop.common.Exception;

import cn.shop.common.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created By 胡敏敏
 * Date 2019/7/5
 * DESC:
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ShopException extends RuntimeException {
    private ExceptionEnums exceptionEnums;
}
