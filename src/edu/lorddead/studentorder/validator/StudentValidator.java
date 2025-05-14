package edu.lorddead.studentorder.validator;

import edu.lorddead.studentorder.domain.AnswerStudent;
import edu.lorddead.studentorder.domain.StudentOrder;

public class StudentValidator {


    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
