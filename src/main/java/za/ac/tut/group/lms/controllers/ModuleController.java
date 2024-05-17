package za.ac.tut.group.lms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.ac.tut.group.lms.models.CourseModule;
import za.ac.tut.group.lms.services.CourseService;
import za.ac.tut.group.lms.services.ModuleService;

@RestController
@RequestMapping(path = "/modules")
public class ModuleController {

    @Autowired
    private ModuleService courseService;

    @GetMapping("/courses")
    public List<CourseModule> getAllModules(Model model) {
        List<CourseModule> modules = null;
        modules = courseService.findAllModules();
        model.addAttribute("modules", modules);
        return modules;
    }
}