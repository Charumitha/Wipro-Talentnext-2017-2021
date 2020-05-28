/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void Main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
	    a=s.nextInt();
	    System.out.println(main1(a));
	}
	private static int main1(int a)
	{
	    int c;
	    if(a>0)
	        c=a%10;
	    else
	        c=(-a)%10;
	   return c;
	}
}
