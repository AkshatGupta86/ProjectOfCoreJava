import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int num, number, temp, total = 0;
System.out.println("Enter 3 Digit Number");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
number = num;
for(;number!=0;number/=10)
{
temp = number % 10;
total = total + temp*temp*temp;
}
if(total == num)
{
System.out.println(num + " is an Armstrong number");
}else
{
System.out.println(num + " is not an Armstrong number");
}
}}