package cn.ego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/30 20:18
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    /**
     * 后台管理的请求页面
     * 因为请求的路径与相应的jsp页面名字一致，
     * 所以使用@PathVariable注解直接从url中获取jsp的名字
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

}
