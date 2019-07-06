package cn.shop.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 胡敏敏
 * Date 2019/7/6
 * DESC: 商品类目
 */
@Table(name = "tb_category")
@Data
public class ItemCategory {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}
