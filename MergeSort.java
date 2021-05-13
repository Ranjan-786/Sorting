import java.util.*;
public class MergeSort 
{   
    int arr[];
    int l;
    int temparr[];
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the elements of array");
        int ar[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            ar[i]=sc.nextInt();
        }
        MergeSort mg=new MergeSort();
        mg.name(ar);
        for(int v : ar)
        {
            System.out.print(v+" ");
        }
    }

    void name(int ar[])
    {
        this.arr=ar;
        this.l=ar.length;
        this.temparr=new int[l];
        divide(0,l-1);
    }

    void divide(int low,int high)
    {
        if(low<high)
        {
            int mid=low+(high-low)/2;

            divide(low,mid);         //division of left side
            divide(mid+1,high);      //division of right side 
            merge(low,mid,high);
        }
    }

    void merge(int low,int mid,int high)
    {
        for(int i=0;i<=l-1;i++)
        {
            temparr[i]=arr[i];
        }
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high)
        {
            if(temparr[i]<temparr[j])
            {
                arr[k]=temparr[i];
                i++;
            }
            else
            {
                arr[k]=temparr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            arr[k]=temparr[i];
            k++;
            i++;
        }
    }
    
}
