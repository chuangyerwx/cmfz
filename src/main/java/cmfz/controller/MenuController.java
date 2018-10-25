package cmfz.controller;

import cmfz.entity.Menu;
import cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/23.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService ms;

    @RequestMapping("/selectAll")
    public @ResponseBody List<Menu> selectAll(){

        return ms.selectAll();
    }



//    public String selectAll(Map m){
//        List<Menu> list = ms.selectAll();
////        hsp.setAttribute("menu",list);
//        m.put("list",list);
//        return "main/main";
//    }

}
