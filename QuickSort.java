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
       qs.quicksort(ar,0,n-1);
       for(int f :ar)
       {
           System.out.print(" "+f );
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
      int v=ar[(p+q)/2];
      while(p<=q)
      {
        while(v>ar[p])
        {
            p++;
        }
        while(v<ar[q])
        {
          q--;
        }
        if(p<=q)
        {
          swap(ar,p,q);
          p++;
          q--;
        }
      } 
        return p;
    }
    void quicksort(int ar[],int p,int q)
    {    
        int g =partition(ar,p,q);
        if(p<g-1)
        {   
            quicksort(ar,p,g-1);
        }
        if(g<q)
        {
            quicksort(ar, g, q);
        }
    }
    
}