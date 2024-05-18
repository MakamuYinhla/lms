package za.ac.tut.group.lms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.ac.tut.group.lms.models.Lesson;
import za.ac.tut.group.lms.services.LessonService;
// import za.ac.tut.group.lms.services.ModuleService;

@RestController
@RequestMapping(path = "/lessons")
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @GetMapping("/courses")
    public List<Lesson> getAllModules(Model model) {
        List<Lesson> lessons = null;
        lessons = lessonService.findAllLessons();
        model.addAttribute("lessons", lessons);
        return lessons;
    }
}