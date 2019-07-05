package cn.shop.common.enums;

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
public enum ExceptionEnums {
    POLICY_CANNOT_BE_NULL(400, "价格不能为空!");

    private int code;
    private String msg;
}
