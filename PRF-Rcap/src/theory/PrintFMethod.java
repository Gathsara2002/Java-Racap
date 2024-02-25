package theory;

/**
 * @author : Gathsara
 * created : 2/25/2024 -- 8:11 PM
 **/

public class PrintFMethod {
    public static void main(String[] args) {

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        /*System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);*/

        //[width]
        // minimum number of characters to be written as output
        /*System.out.printf("Hello %s%n",myString);  //Hello Bro
        System.out.printf("Hello %10s",myString);  //Hello        Bro*/

        //[precision]
        // sets number of digits of precision when outputting floating-point values
       /* System.out.printf("You have this much money %f%n",myDouble);   //You have this much money 1000.000000
        System.out.printf("You have this much money %.2f",myDouble);   //You have this much money 1000.00*/

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        /* System.out.printf("You have this much money %,f",myDouble);   //You have this much money 1,000.000000*/
    }
}
