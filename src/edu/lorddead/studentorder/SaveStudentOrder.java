package edu.lorddead.studentorder;

import edu.lorddead.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199L;
        System.out.println("saveStudentOrder: ");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        return so;
    }
}
