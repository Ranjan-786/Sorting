import java.util.*;
public class BinarySort
 {
      int binary(int ar[],int i,int j,int x)
      {
          int mid=(i+j)/2;
          
          if(ar[mid]==x)
            return mid;

          else
          {
              if(ar[mid]>x)
                return binary(ar,i,mid-1,x);

               else
                return binary(ar,i,mid+1,x); 
          } 
      }


    public static void main(String args[])
    {
        BinarySort bs=new BinarySort();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        System.out.println("enter the elements of array");
        int ar[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println("enter the searchong element");
        int y=sc.nextInt();
        int b= bs.binary(ar,1,n,y);
        System.out.println(b);
    }
    
 }
