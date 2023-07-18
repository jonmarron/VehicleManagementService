package com.jontxu.VehicleManagementService.logic;

import com.jontxu.VehicleManagementService.data.EngineType;
import com.jontxu.VehicleManagementService.data.Vehicle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleManagementService {
    public List<Vehicle> getVehiclesOlderThan2019(List<Vehicle> vehicles){
        return vehicles.stream()
                .filter(vehicle -> vehicle.getYearOfAdmission() < 2019)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getGasolineVehiclesCheaperThan50000(List<Vehicle> vehicles){
        return vehicles.stream()
                .filter(vehicle -> vehicle.getEngineType().equals(EngineType.GASOLINE) && vehicle.getPrice() < 50000)
                .collect(Collectors.toList());
    }

    public Vehicle getMostExpensiveVehicle(List<Vehicle> vehicles){
        return vehicles.stream()
                .max(Comparator.comparingInt(vehicle -> vehicle.getPrice()))
                .orElse(null);
    }
}
