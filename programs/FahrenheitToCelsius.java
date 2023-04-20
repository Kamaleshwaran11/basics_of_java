import java.util.*;
class FahrenheitToCelsius 
{
    public static void main(String args[]) 
    {
        float temp;
        Scanner T=new Scanner(System.in);
        System.out.println("Enter fahrenheit:");
        temp=T.nextInt();
        temp=((temp-32)*5)/9;
        System.out.println("temp in celsisus : "+temp);
    }
}
