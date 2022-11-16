import java.util.*;
class Sample
{
    public int fun1(int a,int b)
    {
        return a+b;
    }
    public int fun1(int a,int b,int c)
    {
        return a*b*c;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        int a=s1.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s1.nextInt();
        }
        Sample s = new Sample();
        if(a==2)
        {
            int i=0;
            int x=arr[i];
            int y=arr[i+1];
            System.out.println(s.fun1(x,y));
        }
        else if(a==3)
        {
            int i=0;
            int x=arr[i];
            int y=arr[i+1];
            int z=arr[i+2];
            System.out.println(s.fun1(x,y,z));
        }
        else
        {
            System.out.println("WRONG INPUT");
        }
    }
}
/*INPUT--- 3 1 2 3
OUTPUT--- 6
*/
