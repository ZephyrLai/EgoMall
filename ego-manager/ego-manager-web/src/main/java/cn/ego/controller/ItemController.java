package cn.ego.controller;

import cn.ego.service.ItemService;
import cn.ego.entity.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/27 8:43
 */
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/getbyId/{id}")
    public TbItem getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }
}
