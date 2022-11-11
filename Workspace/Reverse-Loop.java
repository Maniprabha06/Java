import java.util.*;

class Main {
	public static void main(String[] args)
	{
		int a=56;
		int rem=0;
		int rev=0;
		do
		{
		    rem=a%10;
		    rev=rev*10+rem;
		    a=a/10;
		}while(a!=0);
		System.out.print(rev);
	}
}
/*
input - 56
output - 65
*/
