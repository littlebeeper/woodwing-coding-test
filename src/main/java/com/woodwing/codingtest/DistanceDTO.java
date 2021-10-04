package com.woodwing.codingtest;

import com.woodwing.codingtest.domain.Distance;
import com.woodwing.codingtest.domain.Unit;

import java.math.BigDecimal;

public class DistanceDTO {
    public long length;
    public Unit unit;

    public Distance mapToDomain() {
        return new Distance(BigDecimal.valueOf(length), unit);
    }
}
