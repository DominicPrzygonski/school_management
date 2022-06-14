package za.ac.cput.factory;

import za.ac.cput.domain.Student;
import za.ac.cput.helper.StudentHelper;

public class StudentFactory {
    //method to create a student using builder from Student entity
    public static Student createStudent(String studentId, String email, Name name){
        //ensuring values are not blank or null
        StudentHelper.isBlankOrNull(studentId);
        StudentHelper.checkEmail(email);
        StudentHelper.isBlankOrNull(name);

        //if values are invalid throw IllegalArgumentException
        StudentHelper.checkParam("Student Id", studentId);
        StudentHelper.checkParam("Email", email);
        StudentHelper.checkParam("Name", name);


        //returning values to create the objects only if they are not null
         return new Student.studentBuilder().StudentId(studentId)
                                            .Email(email)
                                            .Name(name)
                                            .build();
    }
}
