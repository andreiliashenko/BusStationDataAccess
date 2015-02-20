package com.anli.busstation.dal.interfaces.entities.staff;

public interface Mechanic extends Employee {

    MechanicSkill getSkill();

    void setSkill(MechanicSkill skill);
}
