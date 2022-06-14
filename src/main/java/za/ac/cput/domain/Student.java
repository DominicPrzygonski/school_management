package za.ac.cput.domain;

import javax.persistence.*;

@Embeddable
@Entity
public class Student {
    //declare variables
    @Id
    private String studentId;
    private String email;
    private Name name;

    //constructor for the builder
    public Student(studentBuilder builder){
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
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
        private String studentId, email;
        private Name name;

        //setting the studentId, email and name for the builder
        public studentBuilder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public studentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public studentBuilder setName(Name name) {
            this.name = name;
            return this;
        }

        public Student.studentBuilder copy(Student student){
            this.studentId = student.studentId;
            this.email = student.email;
            this.name = student.name;

            return this;
        }

        public Student Builder(){
            return new Student(this);
        }
    }
}
