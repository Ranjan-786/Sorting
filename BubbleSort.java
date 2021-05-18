import java.util.*;
public class BubbleSort 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int ar[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            ar[i]=sc.nextInt();
        }
        BubbleSort b=new BubbleSort();
        //int v[]=new int[n];
        b.bubble(ar);
        for(int p :ar)
        {
            System.out.print(p+" ");
        }
        
    }
void bubble(int ar[])
{
    int l=ar.length;
    for(int i=0;i<=l-1;i++)
    {   
        //int y=ar[0];
        for(int j=i+1;j<=l-1;j++)
        {
            
            if(ar[i]>ar[j])
            {
                int t=ar[i];
                ar[i]=ar[j];
                ar[j]=t;
            }

        }    
    }
    /*for(int g: ar)
    {
        return g;
    } */  
}

/*void swap(int ar[],int i,int j)
{
    int t=ar[i];
    ar[i]=ar[j];
    ar[j]=t;
}*/
}
