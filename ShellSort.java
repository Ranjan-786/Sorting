import java.util.*;
public class ShellSort
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        System.out.println("enter the element");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }    
        ShellSort s=new ShellSort();
        s.sort(ar); 
        for( int y : ar)
        {
            System.out.print(y+" ");
        }
    }

    void sort(int arr[])
    {
        int l=arr.length;
        for(int gap=l/2;gap>0;gap/=2)
        {
            for(int i=gap;i<l;i++)
            {   
                int t=arr[i];
                int j=0;
                for( j=i; j>=gap && arr[j-gap]>t; j-=gap)
                {
                    arr[j]=arr[j-gap];
                }
                arr[j]=t;
            }
        }
    }
}