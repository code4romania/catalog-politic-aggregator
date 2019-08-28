package com.code4ro.catalogpolitic.model.persistence.satellites;

import com.code4ro.catalogpolitic.model.persistence.atoms.Car;
import com.code4ro.catalogpolitic.model.persistence.atoms.House;
import com.code4ro.catalogpolitic.model.persistence.atoms.Land;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Avere {

    private String netWorth;
    private String cash;
    private List<House> houses;
    private List<Land> lands;
    private List<Car> cars;
    private String salary;
    private String totalDebt;
}
