package sg.edu.nus.iss.vttp5_ssf_day11workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/", method = RequestMethod.GET)
public class HomeController {
    
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homePage(){
        return "index.html";
    }
    
}
