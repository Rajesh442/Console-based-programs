import java.util.Scanner;
public class TimeApp
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("press 1 to start the timer");
System.out.println("press 2 for stop the timer ");
long startTime=0,endTime=0;
int a=0;
//int a=sc.nextInt();
while(a!=2)
{
a=sc.nextInt();
switch(a)
{
case 1:
startTime=System.currentTimeMillis();
System.out.println("press 2 for stop the timer");
break;

case 2:
endTime=System.currentTimeMillis();
System.out.println(endTime-startTime+ " seconds");
break;

default:
System.out.println("invalid key");
}
}

}
}
