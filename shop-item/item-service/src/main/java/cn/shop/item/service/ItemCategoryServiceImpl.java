package cn.shop.item.service;

import cn.shop.common.Exception.ShopException;
import cn.shop.common.enums.ExceptionEnums;
import cn.shop.item.mapper.ItemCategoryMapper;
import cn.shop.item.pojo.ItemCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author 胡敏敏
 * @Date 2019/7/6
 * @DESC:
 */
@Service
public class ItemCategoryServiceImpl implements ItemCategoryService{

    @Autowired
    private ItemCategoryMapper itemCategoryMapper;

    @Override
    public List<ItemCategory> queryItemCategoryById(Long id) {
        ItemCategory itemCategory = new ItemCategory();
        itemCategory.setParentId(id);
        List<ItemCategory> list = itemCategoryMapper.select(itemCategory);
        if (CollectionUtils.isEmpty(list)) {
            throw new ShopException(ExceptionEnums.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}
