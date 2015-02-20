package com.anli.busstation.dal.interfaces.entities.staff;

public interface Driver extends Employee {

    DriverSkill getSkill();

    void setSkill(DriverSkill skill);
}
