package za.ac.tut.group.lms.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue
    private Long lessonID;
    @Column
    private String lessonName;
    // @OneToMany(cascade = CascadeType.ALL)
    @Column
    private String moduleName;
    @Column
    private String lessonDescription;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "module_id")
    private CourseModule moduleId;

    public CourseModule getModuleId() {
        return moduleId;
    }

    public Lesson(Long lessonID, String lessonName, String moduleName, String lessonDescription) {
        this.lessonID = lessonID;
        this.lessonName = lessonName;
        this.moduleName = moduleName;
        this.lessonDescription = lessonDescription;

    }

    public Lesson() {
    }

    public Long getLessonID() {
        return lessonID;
    }

    public void setLessonID(Long lessonID) {
        this.lessonID = lessonID;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getLessonDescription() {
        return lessonDescription;
    }

    public void setLessonDescription(String lessonDescription) {
        this.lessonDescription = lessonDescription;
    }

}
