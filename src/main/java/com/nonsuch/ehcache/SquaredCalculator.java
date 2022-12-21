package com.nonsuch.ehcache;

public class SquaredCalculator {
    private CacheHelper cache;

    public SquaredCalculator(CacheHelper cache) {
        this.cache = cache;
    }

    public int getSquareValueOfNumber(int input) {
        if (cache.getSquareNumberCache().containsKey(input)) {
            return cache.getSquareNumberCache().get(input);
        }

        System.out.println("Calculating square value of " + input +
                " and caching result.");

        int squaredValue = (int) Math.pow(input, 2);
        cache.getSquareNumberCache().put(input, squaredValue);

        return squaredValue;
    }

    public CacheHelper getCache() {
        return cache;
    }

    public void setCache(CacheHelper cache) {
        this.cache = cache;
    }
//standard getters and setters;
}