package za.ac.tut.group.lms.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LMSController {
    
    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/signup")
    public String signup(){
        return "SignUp.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog.html";
    }

    @GetMapping("/courses")
    public String courses(){
        return "courses.html";
    }


    

    
}
