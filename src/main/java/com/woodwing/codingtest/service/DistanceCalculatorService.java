package com.woodwing.codingtest.service;

import com.woodwing.codingtest.CalculationRequest;
import com.woodwing.codingtest.domain.Distance;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DistanceCalculatorService {
    public Distance calculate(CalculationRequest request) {
        var distanceA = request.distanceA.mapToDomain();
        var distanceB = request.distanceB.mapToDomain();
        var returnUnit = request.returnUnit;

        var sameUnitA = distanceA.convert(returnUnit);
        var sameUnitB = distanceB.convert(returnUnit);

        return sameUnitA.sum(sameUnitB);
    }
}
