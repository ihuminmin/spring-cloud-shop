package cn.shop.item.service;

import cn.shop.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ItemService {

    public Item saveItem(Item item) {
        //商品新增
        long l = new Random().nextLong();
        item.setId(l);
        return item;
    }
}
