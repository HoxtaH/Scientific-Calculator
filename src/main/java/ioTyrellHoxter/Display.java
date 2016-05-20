package ioTyrellHoxter;

import java.util.Scanner;

/**
 * Created by tyrellhoxter on 5/10/16.
 */
public class Display extends Calculator {
    /**
     * declaration of global variables needed to executed within methods.
     */
    private static Scanner sc = new Scanner(System.in);
    public static  DisplayModes defaultMode = DisplayModes.DECIMAL;
    public static DisplayModes currentMode = defaultMode;
    public static boolean calculatorRun = true;
    private static double memory = 0;

    /**
     *primary System out "constructor".  Handles all System outs for the calculator program.
     * @param update
     */
    public static void inputUpdate(String update){
        System.out.println(update);
    }

    /**
     * utilized primary system out constructor but returns a string value from user input.
     * @param update
     * @return
     */
    public static String inputUpdateString(String update){
        inputUpdate(update);
        return sc.next();
    }

    /**
     * 3rd system out event handler that utilizes primary "input update" however this one return a double value from
     * user input.
     * @param update
     * @return
     */
    public static double inputUpdateForDouble(String update){
        inputUpdate(update);
        double input=0;
        try {
            input=sc.nextDouble();
        }
        catch (Exception notANumber){
            inputUpdate("Must input numeric value between 0-9");
            sc.nextLine();

        }
        return input;
    }

    /**
     * Main display method that is used in calculator to display core values
     */
    public static void DisplayValue(){
        inputUpdate("Display Value " + resultNum + " Memory Value " + memory);
    }

    /**
     * Calculator off method is used to turn the calculator while loop off when the correct string is input by user
     */
    public static void calculatorOff(){
        calculatorRun = false;
        inputUpdate("Thank you for all of the calculations.  GOODBYE!");
    }

    /**
     * Store memory method adds the value currently on the display to its value to be used at a later time
     */
    public static void storeMemory (){
        memory = resultNum;
    }

    /**
     * reset memory method resets the current memory value to zero if the user wishes to store a different value
     */
    public static void resetMemory(){
        memory = 0;
    }

    /**
     * Use memory method adds the current value of memory to the displayed value
     */
    public static void useMemory(){
        resultNum += memory;
    }

    /**
     * Converter method section.  Cast the display value to an int to be translated into Binary, hexidecimal, octal value later
     * @return
     */
    public int hexadecimalConverter(){
        return (int) resultNum;
    }

    public int octalConverter(){
        return (int) resultNum;
    }

    public int binaryConverter(){
        return (int) resultNum;
    }

    /**
     * Calculator on is the engine for the entire program.  all methods created are inside of this while loop
     */
    public  void calculatorOn(){
        while(calculatorRun){
            DisplayValue();
            String choice = inputUpdateString("Choose your operation: add | subtract | multiply |  divide | \n " +
                        " | square |, | squareroot | exponential | inverse |  sine | cosine | tan | \n " +
                        " | inverse sine |  inverse cosine | inverse tan | log | log10 | lognatural | \n " +
                        " | anti log | | factorial | switchdisplay | switchmode |\n | clearmemory | storememory | usememory | clear |turnoff |");
            switch (choice.toLowerCase()) {
                case "add":
                    addNumbers();
                    break;
                case "subtract" :
                    subtractNumbers();
                    break;
                case "multiply":
                    multiplyNumbers();
                    break;
                case "divide":
                    divideNumbers();
                    break;
                case "square":
                    squareNumbers();
                    break;
                case "squareroot":
                    squareRootOfNumbers();
                    break;
                case "exponential":
                    exponentialOfNumbers();
                    break;
                case "inverse":
                    inverseOfNumbers();
                    break;
                case "sine":
                    sineOfNumbers();
                    break;
                case "cosine":
                    cosOfNumbers();
                    break;
                case "tan":
                    tanOfNumbers();
                    break;
                case "inversesine":
                    inverseSineOfNumbers();
                    break;
                case "inversecosine":
                    inverseCosineOfNumbers();
                    break;
                case "inversetan":
                    inverseTanOfNumbers();
                    break;
                case "log":
                    logOfNumbers();
                    break;
                case "log10":
                    logX10OfNumbers();
                    break;
                case "lognatural":
                    logNaturalOfNumbers();
                    break;
                case "antilog":
                    antiLogarithmicOfNumbers();
                    break;
                case "factorial":
                    factorialOfNumbers();
                    break;
                case "clearmemory":
                    resetMemory();
                    break;
                case "storememory":
                    storeMemory();
                    break;
                case "usememory":
                    useMemory();
                    break;
                case "switchdisplay":
                    switchMode();
                    break;
                case "switchmode":
                    switchModeToExactMode();
                    break;
                case "clear":
                    clearCalculator();
                    break;
                case "radians":
                    radiansOfNumbers();
                    break;
                case "degrees":
                    degreesOfNumbers();
                    break;
                case "turnoff":
                    calculatorOff();
                    break;

                default : inputUpdate("Not an option");

            }
        }
    }

    /**
     * Switch mode uses the convertor method section and turns all those values into the described values and displays them.
     * Calling switch mode enables the switching between modes by changing the mode to its next value within each "case".
     * Default is decimal mode since that is what the calculator operates in normally.
     */
    public void switchMode() {

        switch (currentMode) {
            case DECIMAL:
                inputUpdate("The decimal value of the displayed value is " + resultNum);
                currentMode = DisplayModes.HEXIDECIMAL;
                break;
            case OCTAL:
                inputUpdate("The Octal version of the displayed value is " + Long.toOctalString(octalConverter()));
                currentMode = DisplayModes.HEXIDECIMAL;
                break;
            case HEXIDECIMAL:
                inputUpdate("The Hexidecimal value of the displayed value is " + Long.toHexString(hexadecimalConverter()));
                currentMode = DisplayModes.BINARY;
                break;
            case BINARY:
                inputUpdate("The Binary value of the displayed value is " + Long.toBinaryString(binaryConverter()));
                currentMode = DisplayModes.DECIMAL;
            default:
                currentMode = DisplayModes.DECIMAL;
        }
    }

    /**
     * The SwitchModeExactMethod allows the user to type in their preferred view of the displayed value.  Value still
     * remains in decimal mode throughout for continued calculation
     */
        public void switchModeToExactMode(){
        String choice = inputUpdateString("Please type in your preferred mode: | decimal | binary | hexidecimal | octal| ");
        switch (choice.toLowerCase()){
            case "decimal": inputUpdate("The decimal value of the displayed value is "+ resultNum);
                currentMode = DisplayModes.HEXIDECIMAL;
                break;
            case "binary": inputUpdate("The Binary value of the displayed value is "+Long.toBinaryString(binaryConverter()));
                currentMode = DisplayModes.DECIMAL;
                break;
            case "hexidecimal": inputUpdate("The Hexidecimal value of the displayed value is " +Long.toHexString(hexadecimalConverter()));
                currentMode = DisplayModes.BINARY;
                break;
            case "octal": inputUpdate("The Octal version of the displayed value is " + Long.toOctalString(octalConverter()));
                currentMode = DisplayModes.HEXIDECIMAL;
                break;
        }
    }


    /**
     * Every math function is encapsulated in this void methods that print statements that go along with the corresponding
     * action.  lines 245 - 348 all reach back to the calculator class's methods and call them within.
     */
    public void addNumbers(){
        double a = inputUpdateForDouble("Please enter a Number");
        resultNum = add(a);
        inputUpdate("The sum is " + resultNum);
    }

    public void subtractNumbers(){
        double a = inputUpdateForDouble("Please enter a Number");
        resultNum = subtract(a);
        inputUpdate("The difference is " + resultNum);
    }

    public void multiplyNumbers(){
        double a = inputUpdateForDouble("Please enter a Number");
        resultNum = multiply(a);
        inputUpdate("The product is " + resultNum);
    }

    public void divideNumbers() {
            double a = inputUpdateForDouble("Please enter a Number to divide by");
            resultNum = divide(a);
            inputUpdate("The quotient is " + resultNum);
    }

    public void squareNumbers(){
        resultNum = square(resultNum);
        inputUpdate("The square is " + resultNum);
    }

    public void squareRootOfNumbers(){
        resultNum = squareRoot(resultNum);
        inputUpdate("The square root is " + resultNum);
    }

    public void exponentialOfNumbers(){
        double a = inputUpdateForDouble("To the Power of ?");
        resultNum = exponents(resultNum, a);
        inputUpdate("To the power of "+ a + " is " + resultNum);
    }

    public void inverseOfNumbers(){
        resultNum = inverse(resultNum);
        inputUpdate("The inverse is " + resultNum);
    }

    public void sineOfNumbers(){
        resultNum = sine(resultNum);
        inputUpdate("The sine is " + resultNum );
    }

    public void cosOfNumbers(){
        resultNum = cos(resultNum);
        inputUpdate("The Cosine is " + resultNum);
    }

    public void tanOfNumbers(){
        resultNum = tan(resultNum);
        inputUpdate("The tangent is " + resultNum);
    }

    public void inverseSineOfNumbers(){
        resultNum = inverseSin(resultNum);
        inputUpdate("The inverse Sine is " + resultNum);
    }

    public void inverseCosineOfNumbers(){
        resultNum = inverseCos(resultNum);
        inputUpdate("The inverse cosine is " + resultNum);
    }

    public void inverseTanOfNumbers(){
        resultNum = inverseTan(resultNum);
        inputUpdate("The inverse tan is " + resultNum);
    }

    public void logOfNumbers(){
        resultNum = log(resultNum);
        inputUpdate("The logarithmic value is " + resultNum);
    }

    public void logX10OfNumbers(){
        resultNum = log10X(resultNum);
        inputUpdate("The logarithmic X10 value is " + resultNum);
    }

    public void logNaturalOfNumbers(){
        resultNum = logNatural(resultNum);
        inputUpdate("The logarithmic natural value is " + resultNum);
    }

    public void antiLogarithmicOfNumbers(){
        resultNum = antiLogarithm(resultNum);
        inputUpdate("The antilogarithmic value is " + resultNum);
    }

    public void factorialOfNumbers(){
        resultNum = factorial(resultNum);
        inputUpdate("The factorial value is " + resultNum);
    }

    public void degreesOfNumbers(){
        resultNum = degrees(resultNum);
        inputUpdate("The displayed value in degrees is "+ resultNum);
    }

    public void radiansOfNumbers(){
        resultNum = radians(resultNum);
        inputUpdate("The displayed value in radians is " + resultNum);
    }
}
