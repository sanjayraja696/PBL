import java.util.Scanner; public class Main
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in); System.out.println("Enter the Unit which want to Convert from:"); String fromUnit = in.nextLine();
System.out.println("Enter the Unit which want to Convert to: "); String toUnit = in.nextLine();
Uerter from = new Uerter(fromUnit); Uerter to = new Uerter(toUnit);
System.out.println("Enter the Value of Unit which want to Convert from:"); double val = in.nextDouble();
double meters = from.toMeters(val); double converted = to.fromMeters(meters);
System.out.println(val + " " + fromUnit + " = " + converted + " " + toUnit);
}
}
 



class Uerter
{
static double INCHES = 0.0254001; static double FEET = 0.3048;
static double MILES = 1609.35; static double MILLIMETERS = 0.001; static double CENTIMETERS = 0.01; static double METERS = 1;
static double KILOMETERS = 1000; private double val ,meters ,converted; String afromUnit;
public Uerter(String fromUnit)
{
afromUnit = fromUnit;
}
public double toMeters(double val)
{
if(afromUnit.equals("inch"))
{
meters = (val*INCHES);
}
else if(afromUnit.equals("ft"))
{
meters = (val*FEET);
}
else if(afromUnit.equals("mi"))
{
meters = (val*MILES);
}
else if(afromUnit.equals("mm"))
{
meters = (val*MILLIMETERS);
}
else if(afromUnit.equals("cm"))
{
meters = (val*CENTIMETERS);
}
else if(afromUnit.equals("m"))
{
meters = (val*METERS);
}
else if(afromUnit.equals("km"))
{
meters = (val*KILOMETERS);
}
return meters;
}
 




public double fromMeters(double meters)
{
if(afromUnit.equals("inch"))
{
converted = Math.round(meters*39.369923740457715);
}
else if(afromUnit.equals("ft"))
{
converted = Math.round(meters*3.280839895013123);
}
else if(afromUnit.equals("mi"))
{
converted = Math.round(meters*1609.34);
}
else if(afromUnit.equals("mm"))
{
converted = Math.round(meters*1000);
}
else if(afromUnit.equals("cm"))
{
converted = Math.round(meters*100);
}
else if(afromUnit.equals("m"))
{
converted = Math.round(meters*1);;
}
else if(afromUnit.equals("km"))
{
converted = Math.round(meters*0.001);
}
return converted;
}
}
