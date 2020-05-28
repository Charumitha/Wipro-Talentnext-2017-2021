/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int a,c;
        System.out.println("enter the number");
        a= s.nextInt();
        
        if(a>9)
        {
            c=a/10;
            System.out.println(+c);
        }
        else if(a>99)
        {
            c=a/100;
            System.out.println(+c);
        }
        
        else
            System.out.println("-1");
            
        
    }
    
}
