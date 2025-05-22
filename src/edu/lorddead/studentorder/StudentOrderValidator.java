package edu.lorddead.studentorder;

import edu.lorddead.studentorder.domain.*;
import edu.lorddead.studentorder.mail.MailSender;
import edu.lorddead.studentorder.validator.ChildrenValidator;
import edu.lorddead.studentorder.validator.CityRegisterValidator;
import edu.lorddead.studentorder.validator.StudentValidator;
import edu.lorddead.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator("Host1", "Login1", "Password1");
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }

    public void checkAll() {
        StudentOrder[] soArray = readStudentOrders();

        for (StudentOrder so : soArray) {
            System.out.println();
            checkOneOrder(so);
        }
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];
        for (int i = 0; i < soArray.length; i++) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }

        return soArray;
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);

        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
