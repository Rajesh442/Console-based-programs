import java.util.Scanner;
public class Billing
{
public static void main(String[] args)
{
double apple,orange,grape,banana,papaya,totalAmount;
double appleprice=140,orangeprice=50,grapeprice=100,bananaprice=60,papayaprice=40;
double apple1=0,orange1=0,grape1=0,banana1=0,papaya1=0;
Scanner sc = new Scanner(System.in);
System.out.println("products "+" choose 1 for apple"+
                              " choose 2 for orange"+
                              " choose 3 for grape"+
                              " choose 4 for banana"+
                              " choose 5 for papaya"+
                              " choose 6 for totalcost");
int n=0;
while(n!=6)
{
System.out.println("enter product id");
n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("enter the quantity in kg");
apple=sc.nextDouble();
apple1=apple*appleprice;
break;
case 2:
System.out.println("enter the quantity in kg");
orange=sc.nextDouble();
orange1=orange*orangeprice;
break;
case 3 :
System.out.println("enter the quantity in kg");
grape=sc.nextDouble();
grape1=grape*grapeprice;
break;
case 4 :
System.out.println("enter the quantity in kg");
banana=sc.nextDouble();
banana1=banana*bananaprice;
break;
case 5 :
System.out.println("enter the quantity in kg");
papaya=sc.nextDouble();
papaya1=papaya*papayaprice;
break;

case 6:
System.out.println("             Challengers Fruit Shop           ");
System.out.println("                    Your Bill          ");
System.out.println(" ");
System.out.println(" ");
System.out.println("product    price     quantity     total");
if(apple1>0)
System.out.println("apple      "+appleprice+"       "+ apple1/appleprice+"kg"+"      "+(apple1));
if(orange1>0)
System.out.println("orange     "+orangeprice+"        "+ orange1/orangeprice+"kg"+"      "+(orange1));
if(grape1>0)
System.out.println("grape      "+grapeprice+"       "+ grape1/grapeprice+"kg"+"      "+(grape1));
if(banana1>0)
System.out.println("banana     "+bananaprice+"        "+ banana1/bananaprice+"kg"+"      "+(banana1));
if(papaya1>0)
System.out.println("papaya     "+papayaprice+"        "+papaya1/papayaprice+"kg"+"      "+(papaya1));

totalAmount= apple1+ orange1+ grape1+ banana1+ papaya1;
System.out.println(" ");
System.out.println(" ");
System.out.println("Total Bill Amount:  "+(totalAmount));
System.out.println(" ");
System.out.println(" Have a healthy life please come again");

break;
default:
System.out.println("invalid input");
}
}
}
}
