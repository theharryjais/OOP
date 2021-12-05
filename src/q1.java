///Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?///
import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        int n,f;
        Scanner scr=new Scanner(System.in);
        System.out.println("\nEnter n value:  ");
        n=scr.nextInt();
        System.out.println("\nPrime numbers are : ");
        for(int i=2;i<=n;i++)
        {
            f=0;
            for(int j=2;j<=i/2;j++)
                if((i%j)==0)
                {
                    f=1;
                    break;
                }
            if(f==0)
                System.out.print(i+"   ");
        }
    }
}