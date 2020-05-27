import java.util.Scanner;
public class Greater
{
    public static void main(String args[])
    {
        int a,b,temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        a=s.nextInt();
        b=s.nextInt();
        
        if(a>b)
        {
            temp=a;
        }
        else
        {
            temp=b;
        }
        System.out.println("Greatest Number" +temp);
    }
}