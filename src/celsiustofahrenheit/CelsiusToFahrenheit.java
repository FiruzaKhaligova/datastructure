/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celsiustofahrenheit;

/**
 *
 * @author rashadkhaligov
 */
public class CelsiusToFahrenheit {
public static void main(String[ ] args)
{
// Declare values that control the table’s bounds.
//The actual implementation includes Javadoc comments that are omitted here but are listed in Appendix H. The comments allow Javadoc to produce nicely formatted information automatically. See Appendix H to read about using Javadoc for your programs.
 
final double TABLE_BEGIN = -50.0;
// The table’s first Celsius temperature
// The table’s final Celsius temperature
// Increment between temperatures in table
// A Celsius temperature
// The equivalent Fahrenheit temperature
final double TABLE_END   = 50.0;

final double TABLE_STEP  = 10;
double celsius;
double fahrenheit;
double kelvin;

System.out.println("TEMPERATURE CONVERSION"); 
System.out.println("----------------------"); 
System.out.println("Celsius   Fahrenheit     Kelvin");
for (celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP) 
    {                                // The for-loop has set celsius equal to the next Celsius temperature of the table.
        fahrenheit = celsiusToFahrenheit(celsius);
        kelvin= celsiustoKelvin(celsius);
        System.out.printf("%6.2fC", celsius); 
        System.out.printf("%10.2fF", fahrenheit);
        System.out.printf("%12.2fK\n", kelvin);
    }

System.out.println("----------------------");
    
}
public static double celsiusToFahrenheit(double c)
    {
final double MINIMUM_CELSIUS = -273.15; 
    if (c < MINIMUM_CELSIUS)
        throw new IllegalArgumentException("Argument " + c + " is too small.");
    return (9.0/5.0) * c + 32;
    }
public static double celsiustoKelvin(double c)
{
    return 2*c;
    
}

}
