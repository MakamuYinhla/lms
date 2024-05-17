package za.ac.tut.group.lms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import za.ac.tut.group.lms.models.Lecturer;
import za.ac.tut.group.lms.services.LecturerService;



@Controller
@RequestMapping(path = "/lecturer")
public class LecturerController {
    @Autowired
    private final LecturerService lecturerService;

    public LecturerController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping("/signup")
    public String showSignUpForm(Model model){
        model.addAttribute("lecturer",new Lecturer());  
        System.out.println("gg");      
        return "signup_lecturer.html";
    }

    // @PostMapping("/addstudent")
    // public void addNewStudent(Student student, BindingResult result, Model model){
    //     lecturerService.addNewStudent(student);
    // }    

    @PostMapping("/addlecturer")
    public String addNewStudent(@ModelAttribute Lecturer lecturer){
        lecturerService.addLecturer(lecturer);;

        return "confirmLec";
    }   

    @PostMapping("/signin")
    public String submitForm(@ModelAttribute Lecturer lecturer) {
        lecturerService.authorizeLecturerAccess(lecturer);
        
        return "lect_dashboard";
    }
    
}
