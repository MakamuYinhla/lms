package za.ac.tut.group.lms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lecture")
public class Lecturer {
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
    @Column(unique = true, length = 9)
    private long lectureID;

    public Lecturer() {

    }

    public Lecturer(long userID, String password, String firstName, String lastName, String email, long lectureID) {
        UserID = userID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.lectureID = lectureID;

    }

    public long getUserID() {
        return UserID;
    }

    public void setUserID(long userID) {
        UserID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getLectureID() {
        return lectureID;
    }

    public void setLectureID(long lectureID) {
        this.lectureID = lectureID;
    }

    @Override
    public String toString() {
        return "Lecturer [UserID=" + UserID + ", password=" + password + ", firstName=" + firstName + ", lastName="
                + lastName + ", email=" + email + ", lectureID=" + lectureID + ", getUserID()=" + getUserID()
                + ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName() + ", getLastName()="
                + getLastName() + ", getEmail()=" + getEmail() + ", getLectureID()=" + getLectureID() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}