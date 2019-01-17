public class Ints {
    public static void main(String[] args){
        //Literals are fixed set variables, while expressions involve some form of computation.
        int x = 1;//this is a literal.
        int y = x+5;//this is an expression.

        /*Integers_______________________________________________________________________________________
        -Ints are the default variable for numbers in Java
        -They have widths of 32
        -Numbers in Java can be visually optimized through the usage of underscores.*/
        int myMinValue = -2_147_483_648; //the smallest value that can be stored in an int variable.
        int myMaxValue = 2_147_483_647; //the largest value
        int myTotal = (myMinValue)/2;

        /*Bytes__________________________________________________________________________________________
        -Bytes are optimal for smaller numbers.
        -They have widths of 8 (quarter of an int).*/
        byte myByteValue = -128;//smallest value is -128 and largest can be 127.
        byte myNewByteValue = (byte) (myByteValue/2);//we need to cast the expression (myByteValue/2)
        //into the proper data type of byte as Java will associate values from expressions as ints by default.

        /*Short Integers_________________________________________________________________________________
        -Short integers are those who are roughly half the size of a regular integer variable
        -They have an allocated width of 16.*/
        short myShortValue = 32_767;//largest value while the smallest is -32768

        /*Long Integers__________________________________________________________________________________
        -The exact opposite of Short Integers so they fit numbers twice the size of a regular Integer.
        -They have a width of 64.
        -Long values should end in L(lower or cap) to indicate to computers that this number is a Long.*/
        long myLongValue = 9_223_372_036_854_775_807L;//this is the largest value
        // while the smallest is -9,223,372,036,854,775,808.

        //Practice
        //1. Create a byte variable and set it to any valid byte number.
        byte var1 = 64;
        //2. Create a short variable and set it to any valid short number.
        short var2 = 1024;
        //3. Create an int variable and set it to any valid int number.
        int var3 = 65_553;
        //4. Create a variable of type long, and make it equal to 50000 + 10 times the sum of the byte, plus, the short plus the int.
        long finalVar = 50000L + 10L*(var1 + var2 + var3);//long doesn't require casting.
        System.out.println("Sum of our variables is = " + finalVar);
    }

}
