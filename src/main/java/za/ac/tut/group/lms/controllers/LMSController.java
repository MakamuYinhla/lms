package za.ac.tut.group.lms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LMSController {

    // @Autowired
    // private final StudentService studentService;

    // @Autowired
    // private final LecturerService lecturerService;

    // public LMSController(StudentService studentService, LecturerService
    // lecturerService) {
    // this.studentService = studentService;
    // this.lecturerService = lecturerService;
    // }

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup.html";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact.html";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog.html";
    }

    @GetMapping("/courses")
    public String courses() {
        return "courses.html";
    }

    @GetMapping("/search")
    public String searchedCourses(Integer courseID) {
        return "courses.html";
    }

    // @GetMapping("/createUser")
    // public String createUser(@RequestParam String name, @RequestParam Long
    // number, @RequestParam String email, @RequestParam String role, @RequestParam
    // String password){

    // try{
    // if(role.equals("Student")){
    // //System.out.println("Student was clicked");
    // Student student = new Student();
    // student.setEmail(email);
    // student.setFirstName(name);
    // student.setPassword(password);
    // student.setStudentID(number);
    // studentService.addNewStudent(student);
    // }
    // else{
    // //System.out.println("Lecturer was clicked instead");
    // Lecturer lecturer = new Lecturer();

    // lecturer.setEmail(email);
    // lecturer.setFirstName(name);
    // lecturer.setPassword(password);
    // lecturer.setLectureID(number);
    // lecturerService.addNewLecturer(lecturer);
    // }
    // }
    // catch(Exception e){
    // return "redirect:signup";
    // }

    // return "redirect:/";
    // }

    // @GetMapping("/login")
    // public String loginUser(@RequestParam String email, @RequestParam String
    // password){

    // try{

    // }
    // catch(Exception e){
    // return "redirect:signup";
    // }

    // return "redirect:/";
    // }

}
