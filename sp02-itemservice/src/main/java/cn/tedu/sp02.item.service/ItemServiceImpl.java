package cn.tedu.sp02.item.service;

import cn.tedu.sp01.service.ItemService;
import cn.tedu.sp01.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public List<Item> getItems(String orderId) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(1, "shop", 1));
        list.add(new Item(2, "shop", 2));
        list.add(new Item(3, "shop", 3));
        list.add(new Item(4, "shop", 4));
        list.add(new Item(5, "shop", 5));
        return list;
    }

    @Override
    public void decreaseNumbers(List<Item> list) {
        for (Item item : list) {
            System.out.println("减少库存-" + item);
        }
    }
}
