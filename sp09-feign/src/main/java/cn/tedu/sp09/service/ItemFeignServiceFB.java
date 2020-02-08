package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.web.util.JsonResult;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
public class ItemFeignServiceFB implements ItemFeignService{
    @Override
    public JsonResult<List<Item>> getItems(String orderId) {
        return JsonResult.err("can not get list of order shop");
    }

    @Override
    public JsonResult decreaseNumber(List<Item> items) {
        return JsonResult.err("can not change shop repository");
    }
}
