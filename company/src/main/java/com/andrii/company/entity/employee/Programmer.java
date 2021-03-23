package com.andrii.company.entity.employee;

import java.util.Date;

public class Programmer extends Employee{
    private ProgrammingLanguages programmingLanguage;
    private Degree degree;
    public Programmer(String firstName, String lastName, double workedHoursAWeek, int salary, String address, Country country, Date hireDate, ProgrammingLanguages programmingLanguage) {
        super(firstName, lastName, workedHoursAWeek, salary, address, country, hireDate);
        this.programmingLanguage = programmingLanguage;
    }
}
