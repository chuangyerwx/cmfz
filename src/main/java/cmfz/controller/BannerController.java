package cmfz.controller;

import cmfz.entity.Banner;
import cmfz.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private BannerService bs;

    @RequestMapping("/selectByPage")
    public @ResponseBody Map selectByPage(int rows, int page){

        int start = (page-1)* rows;

        List<Banner> ban = bs.selectByPage(start,rows);

        int i = bs.selectCount();
        Map map= new HashMap();
        map.put("rows",ban);
        map.put("total",i);
        return map;
    }

    @RequestMapping("/insert")
    public @ResponseBody boolean insert(Banner b){
        try {
            System.out.println(b);
            bs.insert(b);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @RequestMapping("/delete")
    public void delete(int id){
        System.out.println(id);
        bs.delete(id);
    }

    @RequestMapping("/update")
    public void update(int id,int status){

        bs.update(id,status);
    }

}
