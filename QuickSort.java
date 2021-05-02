import java.util.*;
public class QuickSort 
{  
    public static void main(String []a)
    {
        QuickSort qs=new QuickSort();
        Scanner b=new Scanner (System.in);
        System.out.println("entre the length of array");
        int n=b.nextInt();
        System.out.println("entre the elements of array");
        int ar[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            ar[i]=b.nextInt();
        } 
       qs.quicksort(ar,0,n);
       for(int f :ar)
       {
           System.out.println(f);
       }
    }
      
    void swap(int ar[],int j,int i)
    {
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }
    int partition(int ar[],int p,int q)
    {
        int v=ar[p];
        int j=p-1;
        for(int i=0;i<=q-1;i++)
        {
            if(v>ar[i])
            {
                j++;
                swap(ar,j,i);
            }
        }
        swap(ar,j+1,q);
        return j+1;
    }
    void quicksort(int ar[],int p,int q)
    {
        int g =partition(ar,p,q);
        quicksort(ar,p,g-1);
        quicksort(ar, g+1, q);
    }
    
}