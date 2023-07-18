package com.jontxu.VehicleManagementService.data;

import static com.jontxu.VehicleManagementService.data.EngineType.*;

public class Truck extends Vehicle {
    private EngineType engineType;
    public Truck(int id, int price, double drivenKm, int yearOfAdmission, EngineType engineType) {
        super(id, price, drivenKm, yearOfAdmission);
        this.engineType = setEngineType(engineType);
    }


    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public EngineType setEngineType(EngineType engineType) {
        if(!engineType.equals(PETROL) && !engineType.equals(GASOLINE)){
            throw new IllegalArgumentException("Trucks can only have Petrol ot Gasoline Engines");
        }
        return engineType;
    }
}
