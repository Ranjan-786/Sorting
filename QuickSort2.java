import java.util.*;
public class QuickSort2
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        System.out.println("Enter the elements of array");
        int ar[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
             ar[i]=s.nextInt();
        }
        QuickSort2 q=new QuickSort2();
             q.sort(ar,0,n-1);
            for(int y: ar)
            {
                System.out.print(y+" ");
            }
    }
    
  /*  void sort(int ar[],int p,int q)
    {
        if(p<q)
        {
            int e=divide(ar,p,q);
            divide(ar,p,e);
            divide(ar,e+1,q);

        }
    }*/         

    void sort(int ar[],int p,int q)
    {   
        
        for(int i=p;i<=q;i++)
        {   int y=ar[p];
            for(int j=i+1;j<=q;j++)
            {
                if(y>ar[j])
                {
                    continue;
                }
                for(int k=q;k>=1;k--)
                {
                    if(y<ar[k])
                    {
                        continue;
                    }
                    else
                    {   
                        if(j<k)
                        {
                            swap(ar,j,k);
                        }
                        else
                        {
                            swap(ar,p,k);
                        }
                
                    }
                }

               
            }   
        }
            
    }
    void swap(int ar[],int i,int j)
    {
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }
}
