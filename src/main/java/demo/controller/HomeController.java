package demo.controller;

import demo.model.User;
import demo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("user",new User());
        return "create";
    }
}
