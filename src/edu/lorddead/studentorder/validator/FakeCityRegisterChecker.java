package edu.lorddead.studentorder.validator;

import edu.lorddead.studentorder.domain.CityRegisterCheckerResponse;
import edu.lorddead.studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterCheckerResponse checkPerson(Person person) {
        return null;
    }
}
