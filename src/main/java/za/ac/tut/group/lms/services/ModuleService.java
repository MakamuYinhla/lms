package za.ac.tut.group.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
