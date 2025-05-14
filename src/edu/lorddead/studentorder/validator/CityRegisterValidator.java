package edu.lorddead.studentorder.validator;

import edu.lorddead.studentorder.domain.AnswerCityRegister;
import edu.lorddead.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    private String hostName;
    private int port;
    private String login;
    private String password;

    public CityRegisterValidator(String hostName, String login, String password) {
        this.hostName = hostName;
        this.login = login;
        this.password = password;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running: "
                + hostName + ", " + login + ", " + password);

        var ans = new AnswerCityRegister();
        ans.succes = false;
        return ans;
    }
}
