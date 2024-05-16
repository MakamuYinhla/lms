package za.ac.tut.group.lms.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

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
    @Column
    private Integer order;

    public Lesson(Long lessonID, String lessonName, String moduleName, String lessonDescription, Integer order) {
        this.lessonID = lessonID;
        this.lessonName = lessonName;
        this.moduleName = moduleName;
        this.lessonDescription = lessonDescription;
        this.order = order;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

}
