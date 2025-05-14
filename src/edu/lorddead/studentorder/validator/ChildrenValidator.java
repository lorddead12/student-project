package edu.lorddead.studentorder.validator;

import edu.lorddead.studentorder.domain.AnswerChildren;
import edu.lorddead.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
