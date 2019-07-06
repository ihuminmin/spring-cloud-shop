package cn.shop.item.web;

import cn.shop.item.pojo.ItemCategory;
import cn.shop.item.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 胡敏敏
 * Date 2019/7/6
 * DESC:
 */
@RestController
    @RequestMapping("category")
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService itemCategoryService;
    /**
    *根据父节点查询商品分类
    */
    @GetMapping("list")
    public List<ItemCategory> queryCategoryListById(@RequestParam("id") Long id) {
        return itemCategoryService.queryItemCategoryById(id);
    }
}
