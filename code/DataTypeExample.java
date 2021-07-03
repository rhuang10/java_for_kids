public class DataTypeExample {
    public static void main(String[] args) {
        // myNum = 5; // this doesn't work
        int myNum;  // Declare a integer varaible
        myNum = 5; // Assign Integer (whole number)
        
        // myNum = 1.234; // This does not work

        float myFloatNum = 5.99f; // Floating point number
        double myDoubleNum = 5.99999999999; // Double
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String

        System.out.println("My number: " + myNum + ", " + "My float: " + myFloatNum + ", " + "My double: " + myDoubleNum
                + ", " + "My letter: " + myLetter + ", " + "My Bool: " + myBool + ", " + "My Text: " + myText);

        // myNum = 5.123; // this doesn't work
        // myBool = "True"; // this doesn't work

        myDoubleNum = myNum; // this works
        
        System.out.println("My number: " + myNum + ", " + "My float: " + myFloatNum + ", " + "My double: " + myDoubleNum
                + ", " + "My letter: " + myLetter + ", " + "My Bool: " + myBool + ", " + "My Text: " + myText);

    }
}
