package com.jontxu.VehicleManagementService.data;

import java.time.LocalDate;

public abstract class Vehicle {
    private final int id;
    private final int price;
    private final double drivenKm;
    private final int yearOfAdmission;

    public Vehicle(int id, int price, double drivenKm, int yearOfAdmission) {
        this.id = id;
        this.price = price;
        this.drivenKm = drivenKm;
        this.yearOfAdmission = yearOfAdmission;
    }

    public abstract EngineType getEngineType();
    public abstract EngineType setEngineType(EngineType engineType);
    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public double getDrivenKm() {
        return drivenKm;
    }
    public double getDrivenMiles(){
        return drivenKm * Constants.KM_TO_MILES_COEF;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }
}
