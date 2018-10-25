package cmfz.controller;

import cmfz.entity.Admin;
import cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService as;

    @RequestMapping("/login")
    public String login(HttpSession hsp, Admin admin){

        System.out.println(admin);

        Admin list = as.login(admin);
        System.out.println(list);
        hsp.setAttribute("admin",list);
        return "main/main";
    }

}
