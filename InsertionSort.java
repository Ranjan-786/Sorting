import java.util.*;
public class InsertionSort 
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.print("enter elements");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {   
            ar[i]=sc.nextInt();
        }
        InsertionSort i=new InsertionSort();
        i.sort(ar);
        for(int r: ar)
        {
            System.out.print(" ");
            System.out.print(r+" ");
        }
    }
    void sort(int ar[])
    {
        int l=ar.length;
        for(int i=1;i<l;i++)
        {
            int key=ar[i];
                 int j=(i-1);
                 while(j>=0 && key<ar[j])
                {
                    ar[j+1]=ar[j];
                    j--;
                }
                ar[j+1]=key;
        }
    }
    
}
