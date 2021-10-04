package com.woodwing.codingtest.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Distance {
    //    1 m is equivalent to 1.0936 yards
    public static final BigDecimal YARD_TO_METER = new BigDecimal("0.9144");
    //    1 yd is equivalent to 0.9144 meters
    public static final BigDecimal METER_TO_YARD = new BigDecimal("1.093613");

    private final BigDecimal length;
    private final Unit unit;

    public Distance(BigDecimal length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public BigDecimal getLength() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }


    public Distance convert(Unit unit){
        return unit.convert(this);
    }

    public Distance sum(Distance otherDistance) {
        if (!unit.equals(otherDistance.unit)) {
            throw new IllegalArgumentException("Unit type must be same for sum operation");
        }

        var total = this.length.add(otherDistance.length);
        return new Distance(total, unit);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Distance distance = (Distance) other;

        if (!Objects.equals(length, distance.length)) return false;
        return unit == distance.unit;
    }

    @Override
    public int hashCode() {
        int result = length != null ? length.hashCode() : 0;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}
