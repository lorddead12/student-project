package edu.lorddead.studentorder;

import edu.lorddead.studentorder.domain.other.Adult;
import edu.lorddead.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199L;
        System.out.println("saveStudentOrder: ");

        return answer;
    }

    public static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();

        Adult husband = new Adult();

//        husband.setGivenName("Андрей");
//        husband.setSurName("Петров");
//        husband.setPassportNumber("123456");
//        so.setHusband(husband);

//        System.out.println(husband.getPersonString());

        return so;
    }
}
