package cn.shop.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author 胡敏敏
 * @Date 2019/7/6
 * @DESC: 商品品牌
 */
@Data
@Table(name = "tb_brand")
public class ItemBrand {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private String image;
    private Character letter;
}
