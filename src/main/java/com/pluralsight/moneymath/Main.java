package com.pluralsight.moneymath;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        float floatval = 0;
        double doubleval = 0;
        BigDecimal bigDecimalValue = BigDecimal.ZERO;

        for(int i = 0; i < 10; i++){
            floatval += 0.10f;
            doubleval += 0.10;
            bigDecimalValue = bigDecimalValue.add(new BigDecimal("0.10"));

            System.out.printf("%.10f | %.10f | %s%n",
                    floatval, doubleval, bigDecimalValue);
        }

        floatval = 0;
        doubleval = 0;
        bigDecimalValue = BigDecimal.ZERO;

        for(int i = 0; i < 1000; i++){
            floatval += 19.99f;
            doubleval += 19.99;
            bigDecimalValue = bigDecimalValue.add(new BigDecimal("19.99"));

        }

        System.out.println("Float: " + floatval);
        System.out.println("Double: " + doubleval);
        System.out.println("BigDecimal: " + bigDecimalValue);

        System.out.println(floatval == doubleval);
        System.out.println(BigDecimal.valueOf(doubleval).compareTo(bigDecimalValue));


    }


}
