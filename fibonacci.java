import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int n,a=0,b=1;
System.out.println("Enter Terms");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Fibonacci Series till " + n + " terms:");
for (int i=1;i<=n;++i)
{
System.out.println(a);  //the next term
int c = a + b;
a=b;
b=c;
}
}}