import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arrey value");
        int a[]=new int[5];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
            for(int i:a)
            {
                System.out.print(i+" ");
            }
    }
}
