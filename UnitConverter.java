import java.util.Scanner;

public class UnitConverter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("press 1 for convert the weigth from tonne");
System.out.println("press 2 for convert the weigth from quintal");
System.out.println("press 3 for convert the weigth from kilogram");
System.out.println("press 4 for convert the weigth from gram");
System.out.println("press 5 for convert the weigth from milligram");
System.out.println("press 6 for convert the weigth from pound");
int a=sc.nextInt();

Scanner sb=new Scanner(System.in);
System.out.println("press 1 for convert the weigth to tonne");
System.out.println("press 2 for convert the weigth to quintal");
System.out.println("press 3 for convert the weigth to kilogram");
System.out.println("press 4 for convert the weigth to gram");
System.out.println("press 5 for convert the weigth to milligram");
System.out.println("press 6 for convert the weigth to pound");
int b=sb.nextInt();

Scanner input =new Scanner(System.in);
System.out.println("mention the weight");
double c=input.nextDouble();

switch(a)
{
case 1:
if( b==1)
System.out.println(c+" tonne is equal to "+ c +" tonne");
else if(b==2)
System.out.println(c+" tonne is equal to "+ c*10 +" quintal");
else if(b==3)
System.out.println(c+ " tonne is equal to "+ c*1000 +" kilogram");
else if(b==4)
System.out.println(c+ " tonne is equal to "+ c*1000000 +" gram");
else if(b==5)
System.out.println(c+ " tonne is equal to "+ c*1000000000 +" milligram");
else if(b==6)
System.out.println(c+ " tonne is equal to "+ c*2204.62262 +" pound");
break;

case 2:
if(b==1)
System.out.println(c+" quintal is equal to "+ c*0.1 +" tonne");
else if(b==2)
System.out.println(c+" quintal is equal to "+ c +" quintal");
else if(b==3)
System.out.println(c+ " quintal is equal to "+ c*100 +" kilogram");
else if(b==4)
System.out.println(c+ " quintal is equal to "+ c*100000 +" gram");
else if(b==5)
System.out.println(c+ " quintal is equal to "+ c*100000000 +" milligram");
else if(b==6)
System.out.println(c+ " quintal is equal to "+ c*220.462262 +" pound");
break;

case 3:
if(b==1)
System.out.println(c+" kilogram is equal to "+ c*0.001 +" tonne");
else if(b==2)
System.out.println(c+" kilogram is equal to "+ c*0.01 +" quintal");
else if(b==3)
System.out.println(c+ " kilogram is equal to "+ c +" kilogram");
else if(b==4)
System.out.println(c+ " kilogram is equal to "+ c*1000 +" gram");
else if(b==5)
System.out.println(c+ " kilogram is equal to "+ c*1000000 +" milligram");
else if(b==6)
System.out.println(c+ " kilogram is equal to "+ c*2.20462262 +" pound");
break;

case 4:
if(b==1)
System.out.println(c+" gram is equal to "+ c*0.000001 +" tonne");
else if(b==2)
System.out.println(c+" gram is equal to "+ c*0.00001 +" quintal");
else if(b==3)
System.out.println(c+ " gram is equal to "+ c*0.001 +" kilogram");
else if(b==4)
System.out.println(c+ " gram is equal to "+ c +" gram");
else if(b==5)
System.out.println(c+ " gram is equal to "+ c*0.001 +" milligram");
else if(b==6)
System.out.println(c+ " gram is equal to "+ c*0.00220462262 +" pound");
break;

case 5:
if(b==1)
System.out.println(c+" milligram is equal to "+ c*0.000000001 +" tonne");
else if(b==2)
System.out.println(c+" milligram is equal to "+ c*0.00000001 +" quintal");
else if(b==3)
System.out.println(c+ " milligram is equal to "+ c*0.000001 +" kilogram");
else if(b==4)
System.out.println(c+ " milligram is equal to "+ c*0.001 +" gram");
else if(b==5)
System.out.println(c+ " milligram is equal to "+ c +" milligram");
else if(b==6)
System.out.println(c+ " milligram is equal to "+ c*0.0000220462262 +" pound");
break;

case 6:
if(b==1)
System.out.println(c+" pound is equal to "+ c*0.00045359237 +" tonne");
else if(b==2)
System.out.println(c+" pound is equal to "+ c*0.045359237 +" quintal");
else if(b==3)
System.out.println(c+ " pound is equal to "+ c*0.45359237 +" kilogram");
else if(b==4)
System.out.println(c+ " pound is equal to "+ c*453.59237 +" gram");
else if(b==5)
System.out.println(c+ " pound is equal to "+ c*453592.37 +" milligram");
else if(b==6)
System.out.println(c+ " pound is equal to "+ c +" pound");
break;

default:
System.out.println("invalid conversion");
}

}
}
