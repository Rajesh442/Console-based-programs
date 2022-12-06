public class Ebpayment
{
public static void main(String args[])
{
int ebunit=474;
double billpay=0;
switch(1){
case 1:
if(ebunit>100 && ebunit<=200)
System.out.println((ebunit-100)*1.5);
case 2:
if(ebunit>200 && ebunit<=500)
{
billpay=100*2+ (ebunit-200)*3;
System.out.println(billpay);
}
default:
if(ebunit>500 && ebunit<=9999999)
{
billpay=(100*3.5)+(300*4.6)+((ebunit-500)*6.6);
System.out.println(billpay);
}
}


}
}
