package com.woodwing.codingtest.domain;

import java.math.BigDecimal;

import static com.woodwing.codingtest.domain.Distance.METER_TO_YARD;
import static com.woodwing.codingtest.domain.Distance.YARD_TO_METER;

public enum Unit {
    //    1 m is equivalent to 1.0936 yards
//    1 yd is equivalent to 0.9144 yards
    YARD(METER_TO_YARD),
    METER(YARD_TO_METER);

    private final BigDecimal factor;

    Unit(BigDecimal factor) {
        this.factor = factor;
    }

    public Distance convert(Distance distance) {
        if (distance.getUnit().equals(this)) {
            return distance;
        }

        var converted = distance.getLength().multiply(factor);
        return new Distance(converted, this);
    }
}
