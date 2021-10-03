package com.woodwing.codingtest;

public class CalculationRequest {
    public Distance distanceA;
    public Distance distanceB;
    public Unit returnUnit;

    @Override
    public String toString() {
        return "CalculationRequest{" +
                "distanceA=" + distanceA +
                ", distanceB=" + distanceB +
                ", returnUnit=" + returnUnit +
                '}';
    }
}
