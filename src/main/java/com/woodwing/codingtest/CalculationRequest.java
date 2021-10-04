package com.woodwing.codingtest;

import com.woodwing.codingtest.domain.Unit;

public class CalculationRequest {
    public DistanceDTO distanceA;
    public DistanceDTO distanceB;
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
