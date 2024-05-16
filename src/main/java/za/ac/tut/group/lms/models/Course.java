package za.ac.tut.group.lms.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue
    private Long courseID;
    @Column
    private String courseName;
    @Column
    private String courseDescription;
    @Column
    private Long lectureID;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column
    private Boolean isActive;

    public Course() {
    }

    public Course(Long courseID, String courseName, String courseDescription, Long lectureID, Date startDate,
            Date endDate,
            Boolean isActive) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.lectureID = lectureID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Long getLectureID() {
        return lectureID;
    }

    public void setLectureID(Long lectureID) {
        this.lectureID = lectureID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Course [courseID=" + courseID + ", courseName=" + courseName + ", courseDescription="
                + courseDescription
                + ", lectureID=" + lectureID + ", startDate=" + startDate + ", endDate=" + endDate + ", isActive="
                + isActive + "]";
    }

}
