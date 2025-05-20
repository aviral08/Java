import java.util.Scanner;

public class lower_bound
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,5,6,7,8,8,8,9,9,9};
        int target;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target");
        target=sc.nextInt();
        sc.close();
        int start=0;
        int end=arr.length-1;
        int mid;
        int index=-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
            index=mid;
            end=mid-1;
            }
            else if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        if(index==-1)
        System.out.println("does not exist");
        else
        System.out.println(index);

    }

}