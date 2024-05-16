package za.ac.tut.group.lms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import za.ac.tut.group.lms.models.Student;
import za.ac.tut.group.lms.services.StudentService;


@Controller
@RequestMapping(path = "/student")
public class StudentController {
    // Similar to @EJB
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // @GetMapping("/signup")
    // public String showSignUpForm(){
    //     System.out.println("Sign up was touched");
    //     return "signup_student.html";
    // }

    @PostMapping("/addstudent")
    public void addNewStudent(Student student, BindingResult result, Model model){
        studentService.addNewStudent(student);
    }    

}
