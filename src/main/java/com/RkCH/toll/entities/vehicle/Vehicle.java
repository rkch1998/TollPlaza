package com.RkCH.toll.entities.vehicle;

import com.RkCH.toll.enums.VehicleType;

public interface Vehicle {
    String getLicensePlate();
    VehicleType getType();
}
