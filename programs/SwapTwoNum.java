//program for swap two number using 3rd varaiables
import java.util.Scanner;
class SwapTwoNum
{
public static void main(String args[])
{
int x ,y , temp;
System.out.println("Enter x and y:");
Scanner in= new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
System.out.println("Before swap\nx="+x+"\ny="+y);
temp=x;
x=y;
y=temp;
System.out.println("After Swap\nx="+x+"\ny="+y);
}
}
