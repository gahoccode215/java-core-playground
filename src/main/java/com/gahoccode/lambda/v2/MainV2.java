package com.gahoccode.lambda.v2;

import com.gahoccode.lambda.MathOperation;

public class MainV2 {
    public static void main(String[] args) {
        int onScreenNumber = 0;

        MathOperation add = Integer::sum;
        MathOperation subtract = (a,b ) -> a - b;
        MathOperation multiply = (a,b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        onScreenNumber = calculate(5, add, 10);
        onScreenNumber = calculate(onScreenNumber, multiply, 2);
        onScreenNumber = calculate(onScreenNumber, subtract, 1);
        onScreenNumber = calculate(onScreenNumber, divide, 4);

        System.out.println(onScreenNumber);
    }

    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber){
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }
}
