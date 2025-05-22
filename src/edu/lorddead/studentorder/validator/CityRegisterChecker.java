package edu.lorddead.studentorder.validator;

import edu.lorddead.studentorder.domain.CityRegisterCheckerResponse;
import edu.lorddead.studentorder.domain.Person;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person);
}
