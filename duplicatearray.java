import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array: ");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("Enter element of arrays: ");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println("Duplicate element is: "+arr[i]);
}
}
}
}
}