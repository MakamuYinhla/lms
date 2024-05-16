package za.ac.tut.group.lms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private long UserID;
    @Column
    private String password;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String role;

    @Column(unique = true, length = 9)
    private long studentID;
    @Column
    private String major;

    public Student() {
        
    }

    public Student(String password, String firstName, String lastName, String email, long studentID, String major) {
        this.studentID = studentID;
        this.major = major;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
