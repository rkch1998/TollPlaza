package com.RkCH.toll.enums;

public enum VehicleType {
    CAR(2.00),
    TRUCK(5.00),
    BUS(7.00),
    MOTORCYCLE(1.00);

    private final double tollRate;

    VehicleType(double tollRate) {
        this.tollRate = tollRate;
    }

    public double getTollRate() {
        return tollRate;
    }
}
