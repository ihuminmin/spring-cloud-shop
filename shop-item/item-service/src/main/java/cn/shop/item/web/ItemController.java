package cn.shop.item.web;

import cn.shop.common.Exception.ShopException;
import cn.shop.common.enums.ExceptionEnums;
import cn.shop.item.pojo.Item;
import cn.shop.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(value = "save")
    public ResponseEntity<Item> save(Item item) {
        if (item.getPrice() == null) {
            //return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            throw new ShopException(ExceptionEnums.POLICY_CANNOT_BE_NULL);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.saveItem(item));
    }
}
