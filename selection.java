import java.util.Scanner;
class selection{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
System.out.println("Enter the array elements");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
    int value=sc.nextInt();
    arr[i]=value;
}
System.out.println("Before sorting elements are");
for(int i=0;i<n;i++)
{
    System.out.print(" "+arr[i]);
}
int temp;
for(int i=0;i<n;i++)
{
    for( int j=i+1;j<n;j++)
    {
        if(arr[i]>arr[j])
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
System.out.println("After sorting elements are");
for(int i=0;i<n;i++)
{
    System.out.print(" "+arr[i]);
}
}}