package com.Tanmay;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5/2;
        //Float has 7 digits of precision after the decimal point. This corresponds to 4 bytes or 32 bits.
        float myFloatValue = 5f/3f;
        //Double has 16 digits of precision after the decimal point. This corresponds to 8 bytes or 64 bits.
        double myDoubleValue = 5d/3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 15;
        double kilograms = pounds*0.45359237d;
        System.out.println("Kilograms = " + kilograms);

    }
}
