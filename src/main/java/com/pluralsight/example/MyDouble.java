package com.pluralsight.example;

public class MyDouble {
    private double value;

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }

    public MyDouble(double value){
        this.value = value;
    }

    public MyDouble plus(MyDouble lhs, MyDouble rhs){
        double result = lhs.getValue() + rhs.getValue();

        MyDouble finalResult = new MyDouble(result);

        return finalResult;
    }

}
