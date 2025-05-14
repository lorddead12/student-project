package edu.lorddead.studentorder.validator;

import edu.lorddead.studentorder.domain.AnswerWedding;
import edu.lorddead.studentorder.domain.StudentOrder;

public class WeddingValidator {


    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }
}
