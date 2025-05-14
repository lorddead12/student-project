package edu.lorddead.studentorder;

import edu.lorddead.studentorder.domain.*;
import edu.lorddead.studentorder.mail.MailSender;
import edu.lorddead.studentorder.validator.ChildrenValidator;
import edu.lorddead.studentorder.validator.CityRegisterValidator;
import edu.lorddead.studentorder.validator.StudentValidator;
import edu.lorddead.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();
            if (so == null) {
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.succes) {
//                continue;
                break;
            }

            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    /*  Чтение студентческой заявки    */
    static StudentOrder readStudentOrder() {
        var so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        var crv1 = new CityRegisterValidator("Host1", "Login1", "Password1");
        var ans1 = crv1.checkCityRegister(so);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator chd = new ChildrenValidator();
        return chd.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        StudentValidator sv = new StudentValidator();
        return sv.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
