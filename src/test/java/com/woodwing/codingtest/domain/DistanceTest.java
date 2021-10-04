package com.woodwing.codingtest.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.woodwing.codingtest.domain.Unit.METER;
import static com.woodwing.codingtest.domain.Unit.YARD;


class DistanceTest {

    @Test
    void testSum() {
        var expectedTotal = new Distance(new BigDecimal("10.1440"), METER);

        var yardDistance = new Distance(BigDecimal.TEN, YARD);
        var meterDistance = new Distance(BigDecimal.ONE, METER);
        var total = yardDistance.convert(METER).sum(meterDistance);

        Assertions.assertEquals(expectedTotal, total);

    }
}
