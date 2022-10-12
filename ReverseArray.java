/*class ReverseArray
{
     static void reverse(int arr[],int start,int end)
    {
int temp;
while(start<end)
{
    temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}
    }
     static void print(int arr[],int size)
    {
 for(int i=0;i<size;i++)
 {
     System.out.print(arr[i]+"  ");
    
     
    } System.out.println();

      }

    public static void main(String args[])
    {
        int arr[]={1,2,5,8,3,6};
        int start= 0, end =5;
        print(arr,6);
        reverse(arr,0,5);
        System.out.println("The reverse array is:\n");
        print(arr,6);
    }
}*/
//Recursive way
import java.util.Scanner;
class ReverseArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the numbers in array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
                 }
                 System.out.println("Array is");
                 for(int j=0;j<n;j++)
                 {
                    System.out.print(a[j]+ " ");
                 }
                 System.out.println("");
    System.out.println("Reverse array is");
    int start=0;
    
    for( int last=n-1;last>=start;last--)
    {
        System.out.print(a[last]+" ");
        
    }
    }
}