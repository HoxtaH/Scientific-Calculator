package ioTyrellHoxter;

import sun.tools.asm.CatchData;

import java.util.Random;

/**
 * Created by tyrellhoxter on 5/10/16.
 */
public class Calculator {
    /**
     * Declaration of the value being stored throughout the calculator occurs here.  resultNum is the value that EVERY
     * method updates in order to update the user on current value.
     * Random number object is also called here for mathRandom method.
     */
    public static Random random = new Random(101);
    public static double resultNum = 0;

    /**
     * Clear calculator method resets the value back to zero in order to start fresh on new calculations
     */
    public static void clearCalculator(){
        resultNum = 0;
    }

    /**
     * Lines 29 - 148 are all the primary math functions that operate the calculator class.  Anything
     * involving calculations is HERE.  the primary source.
     * @param a
     * @return
     */
    public static double add(double a){
        resultNum += a;
        return resultNum;
    }

    public static double subtract(double a){
        resultNum -= a;
        return resultNum;
    }

    public static double multiply(double a){
        resultNum *= a;
        return resultNum;
    }

    public static double divide(double a){
        resultNum /= a;
        if(a == 0){
            Display.inputUpdate("(sigh)... You can't divide any value by zero.  Please clear so that other operations may occur");
        }
        return resultNum;
    }

    public static double square(double a){
        resultNum = a * a;
        return resultNum;
    }

    public static double squareRoot(double a){
        resultNum = Math.sqrt(a);
        return resultNum;
    }

      public static double exponents(double a, double b){
        resultNum = Math.pow(a,b);
          return resultNum;
    }

    public static double inverse(double a){
        resultNum = Math.abs(a);
        return resultNum;
    }

    public static double sine(double a){
        resultNum = Math.sin(a);
        return resultNum;
    }

    public static double cos(double a){
        resultNum = Math.cos(a);
        return resultNum;
    }

    public static double tan(double a){
        resultNum = Math.tan(a);
        return resultNum;
    }

    public static double inverseSin(double a){
        resultNum = Math.asin(a);
        return resultNum;
    }

    public static double inverseCos(double a){
        resultNum = Math.acos(a);
        return resultNum;
    }

    public static double inverseTan(double a){
        resultNum = Math.atan(a);
        return resultNum;
    }

    public static double log(double a){
        resultNum = Math.log(a);
        return resultNum;
    }

    public static double log10X(double a){
        resultNum = Math.log10(a);
        return resultNum;
    }

    public static double logNatural(double a){
        resultNum = Math.log1p(a);
        return resultNum;
    }

    public static double antiLogarithm(double a){
        double log = Math.log(a);
        resultNum = Math.abs(log);
        return resultNum;
    }

    public static double factorial(double a){
        double result = 1;
        for(double i = 1; i <= a; i++){
            result = i * result;
        }
        resultNum = result;
        return resultNum;
    }

    public static double degrees(double a){
        resultNum = Math.toDegrees(a);
        return resultNum;
    }

    public static double radians(double a){
        resultNum = Math.toRadians(a);
        return resultNum;
    }

    public static double randomMath(double a){
        double numRandom = random.nextDouble();
        resultNum *= numRandom;
        return resultNum;
    }
}





