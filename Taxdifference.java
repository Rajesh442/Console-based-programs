public class Taxdifference
{
double salary=1200000.0;
double oldTax=0;
double newTax=0;
void taxDifference()
{
switch(1){
case 1:
if(salary>250000 && salary<=500000)
{
oldTax=(salary-250000)*5/100;
newTax=(salary-250000)*5/100;
}
case 2:
if(salary>500000 && salary<=750000)
{
oldTax=((salary-500000)*20/100)+12500;
newTax=((salary-500000)*10/100)+12500;
}
case 3:
if(salary>750000 && salary<=1000000)
{
oldTax=(salary-750000)*0.2+62500;
newTax=(salary-750000)*0.15+37500;
}
case 4:
if(salary>1000000 && salary<=1250000)
{
oldTax=(salary-1000000)*0.3+112500;
newTax=(salary-1000000)*0.2+74500;
}
case 5:
if(salary>1250000 && salary<=1500000)
{
oldTax=(salary-1200000)*0.3+187500;
newTax=(salary-1200000)*0.25+124500;
}
default :
if(salary>1500000){
oldTax=(salary-1500000)*0.3+262500;
newTax=(salary-1500000)*0.3+187000;
}
System.out.println("If salary is "+ salary+"rs per Annum");
System.out.println("old tax is "+oldTax+"rs");
System.out.println("New tax is "+newTax+"rs");
System.out.println("Difference between oldtax and newtax is " + (oldTax-newTax) + "rs");
}

}
public static void main(String args[])
{
Taxdifference obj=new Taxdifference();
obj.taxDifference();
}
}
