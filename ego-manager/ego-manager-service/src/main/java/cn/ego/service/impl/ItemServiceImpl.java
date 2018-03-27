package cn.ego.service.impl;

import cn.ego.mapper.TbItemMapper;
import cn.ego.service.ItemService;
import cn.ego.entity.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/27 8:45
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }
}
