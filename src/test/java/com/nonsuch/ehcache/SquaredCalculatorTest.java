package com.nonsuch.ehcache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaredCalculatorTest {
    private CacheHelper cacheHelper = new CacheHelper();
    private SquaredCalculator squaredCalculator = new SquaredCalculator(cacheHelper);

    @Test
    public void whenCalculatingSquareValueAgain_thenCacheHasAllValues() {
        for (int i = 10; i < 15; i++) {
            assertFalse(cacheHelper.getSquareNumberCache().containsKey(i));
            System.out.println("Square value of " + i + " is: "
                    + squaredCalculator.getSquareValueOfNumber(i) + "\n");
        }

        for (int i = 10; i < 15; i++) {
            assertTrue(cacheHelper.getSquareNumberCache().containsKey(i));
            System.out.println("Square value of " + i + " is: "
                    + squaredCalculator.getSquareValueOfNumber(i) + "\n");
        }
    }
}