package za.ac.cput.domain;

import javax.persistence.*;

@Entity(name = "Student")
public class Student {
    Name name = new Name();

    //declare variables
    @Id
    @Column(name = "studentId", updatable = false, nullable = false, columnDefinition = "TEXT")
    public String studentId;
    @Column(name = "email", updatable = false, nullable = false, columnDefinition = "TEXT")
    public String email;
    @Embedded
    @Column(name = "name", updatable = false, nullable = false, columnDefinition = "TEXT")
    public Name name;

    //constructor for the builder
    public Student(studentBuilder builder){
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
    }

    //getters
    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    //create variables into a toString
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    //builder pattern class for student
    public static class studentBuilder{
        private String studentId;
        private String email;
        private Name name;

        //setting the studentId, email and name for the builder
        public studentBuilder StudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public studentBuilder Email(String email) {
            this.email = email;
            return this;
        }

        public studentBuilder Name(Name name) {
            this.name = name;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
