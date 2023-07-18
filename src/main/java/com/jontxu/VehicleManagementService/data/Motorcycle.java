package com.jontxu.VehicleManagementService.data;

public class Motorcycle extends Vehicle {
    private final EngineType engineType;

    public Motorcycle(int id, int price, double drivenKm, int yearOfAdmission, EngineType engineType) {
        super(id, price, drivenKm, yearOfAdmission);
        this.engineType = setEngineType(engineType);
    }

    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public EngineType setEngineType(EngineType engineType) {
        return engineType;
    }
}
