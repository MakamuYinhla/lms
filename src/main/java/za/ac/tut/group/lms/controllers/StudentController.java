package za.ac.tut.group.lms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
=======
>>>>>>> 72b5342d0291a24ee6f90147bbada7b5741696e2
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import za.ac.tut.group.lms.models.Student;
import za.ac.tut.group.lms.services.StudentService;



@Controller
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

<<<<<<< HEAD
    @GetMapping("/signup")
    public String showSignUpForm(Model model){
        model.addAttribute("student",new Student());  
        System.out.println("gg");      
        return "signup_student.html";
    }

    // @PostMapping("/addstudent")
    // public void addNewStudent(Student student, BindingResult result, Model model){
    //     studentService.addNewStudent(student);
    // }    
=======

    @PostMapping("/addstudent")
    public void addNewStudent(){
        Student student = new Student();
    }    
>>>>>>> 72b5342d0291a24ee6f90147bbada7b5741696e2

    @PostMapping("/addstudent")
    public String addNewStudent(@ModelAttribute Student student){
        studentService.addNewStudent(student);

        return "confirm";
    }   

    @PostMapping("/signin")
    public String submitForm(@ModelAttribute Student stu) {
        studentService.authorizeStudentAccess(stu);
        
        return "stu_dashboard";
    }
    
}
