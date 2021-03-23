package com.andrii.company.entity.employee;

import java.util.Date;

public class Accountant extends Employee{
    public Accountant(String firstName, String lastName, double workedHoursAWeek, int salary, String address, Country country, Date hireDate) {
        super(firstName, lastName, workedHoursAWeek, salary, address, country, hireDate);
    }
}
