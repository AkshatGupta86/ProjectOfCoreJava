import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int num;
System.out.println("Enter your Number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
boolean a=false;
for(int i=2;i<=num/2;i++)   // condition for nonprime number
{
if(num%i==0)
{
a=true;
break;
}
}
if(!a)
{
System.out.println(num + " is a prime number.");
}else
{
System.out.println(num + " is not a prime number.");
}
}}