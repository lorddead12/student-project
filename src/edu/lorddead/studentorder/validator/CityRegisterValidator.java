package edu.lorddead.studentorder.validator;

import edu.lorddead.studentorder.domain.AnswerCityRegister;
import edu.lorddead.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    private String hostName;
    private int port;
    private String login;
    private String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator(String hostName, String login, String password) {
        this.hostName = hostName;
        this.login = login;
        this.password = password;
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        var ans = new AnswerCityRegister();
        return ans;
    }
}
