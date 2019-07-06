package cn.shop.item.service;

import cn.shop.item.pojo.ItemCategory;

import java.util.List;

/**
 * @author 胡敏敏
 * Date 2019/7/6
 * DESC:
 */
public interface ItemCategoryService {

    /**
     * 根据商品父节点ID查询商品目录
     * @param id
     * @return
     */
    List<ItemCategory> queryItemCategoryById(Long id);
}
