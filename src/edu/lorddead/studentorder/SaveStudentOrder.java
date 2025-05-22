package edu.lorddead.studentorder;

import edu.lorddead.studentorder.domain.StudentOrder;
import edu.lorddead.studentorder.domain.other.Adult;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder(10);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199L;
        System.out.println("saveStudentOrder: ");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        printStudentOrder(so);
        Adult husband = new Adult("Васильев", "Андрей", "Петрович", null);

        return so;
    }

    static void printStudentOrder(StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderId());
    }
}
