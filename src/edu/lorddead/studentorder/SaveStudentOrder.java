package edu.lorddead.studentorder;

import edu.lorddead.studentorder.domain.StudentOrder;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        runAll();
    }

    static void runAll() {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199L;
        System.out.println("saveStudentOrder: " + studentOrder.hLastName);

        return answer;
    }
}
