package za.ac.tut.group.lms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import za.ac.tut.group.lms.models.Lesson;
import za.ac.tut.group.lms.services.LessonService;
import za.ac.tut.group.lms.services.ModuleService;

@Controller
public class ModuleController {

    @Autowired
    private LessonService lessonService;

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/performAction")
    public String goToModule(@RequestParam String module) {
        System.out.println("Received module: " + module);
        // Ensure the redirect URL is correct
        return "redirect:/single-course?module=" + module;
    }

    @GetMapping("/single-course")
    public String getSingleCourse(@RequestParam String module, Model model) {
        // Add the module to the model to use it in the view
        model.addAttribute("modulename", module);

        //
        Long id = moduleService.getModuleId(module);
        System.out.println("ID is : " + id);
        List<Lesson> lessons = lessonService.findAllLessons();
        /*
         * for (Lesson lesson : lessons) {
         * if (!lesson.getModuleName().equals(module)) {
         * lessons.remove(lesson);
         * }
         * }
         */
        System.out.println("Size is : " + lessons.size());
        try {
            for (Lesson less : lessons) {
                System.out.println(less.getModuleName() + "u" + module);
                if (!(less.getModuleName().trim().equalsIgnoreCase(module.trim()))) {
                    lessons.remove(less);
                    System.out.println("0");
                }
            }
        } catch (Exception e) {
            System.out.println("error faced");
        }
        System.out.println("Size is : " + lessons.size());
        model.addAttribute("lessons", lessons);

        return "single-course"; // Ensure this resolves to single-course.html or single-course.jsp based on your
                                // view resolver configuration
    }

}