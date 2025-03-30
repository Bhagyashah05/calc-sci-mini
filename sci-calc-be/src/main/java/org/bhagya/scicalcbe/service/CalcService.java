package org.bhagya.scicalcbe.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double squareRoot(double x) {
        if(x<0) return -1;
        return Math.sqrt(x);
    }
    public long factorial(int x) {
        if(x<=1) return -1;
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public double naturalLog(double x) {
        if(x<=0) return -1;
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
