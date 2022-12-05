import java.util.Scanner;
public class CountApp
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("type any number");
int a=sc.nextInt();
int count=0;
while(a!=0)
{
count=count+1;
a=sc.nextInt();
}
System.out.println("number of count is "+ count);
}
}
