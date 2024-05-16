package za.ac.tut.group.lms.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LMSController {
    
    @GetMapping("/")
    public String index(){
        return "index.html";
    }


    

    
}
