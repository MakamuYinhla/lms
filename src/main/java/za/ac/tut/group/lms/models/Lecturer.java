package za.ac.tut.group.lms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lectures")
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
    private Integer lecturerID;

    public Lecturer() {

    }

    public Lecturer(Integer userID, String password, String firstName, String lastName, String email, Integer lecturerID) {
        UserID = userID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.lecturerID = lecturerID;

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

    public Integer getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(Integer lecturerID) {
        this.lecturerID = lecturerID;
    }

    @Override
    public String toString() {
        return "Lecturer [UserID=" + UserID + ", password=" + password + ", firstName=" + firstName + ", lastName="
                + lastName + ", email=" + email + ", lecturerID=" + lecturerID + "]";
    }

}