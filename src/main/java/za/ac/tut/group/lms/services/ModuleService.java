package za.ac.tut.group.lms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import za.ac.tut.group.lms.models.CourseModule;
import za.ac.tut.group.lms.repository.ModuleRepository;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository modulRepository;

    public ModuleService(ModuleRepository modulRepository) {
        this.modulRepository = modulRepository;
    }

    public void addNewModule(CourseModule module) {
        modulRepository.save(module);
    }

    public List<CourseModule> findAllModules() {
        return modulRepository.findAll();
    }

    public Long getModuleId(String name) {
        List<CourseModule> modules = modulRepository.findAll();

        System.out.println("List of modules: " + modules.size() + " " + name);
        for (CourseModule courseModule : modules) {
            System.out.println("Module names: " + courseModule.getModuleName());
            if (courseModule.getModuleName().equals(name)) {
                System.out.println(courseModule.getModuleName());
                return courseModule.getModuleId();
            }
        }
        return -1l;
    }

}
