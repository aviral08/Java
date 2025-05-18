import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int target=20;
        int start=0;
        int end =arr.length-1;
        int mid;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            System.out.println(mid);
            if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        if(start>=end)
        System.out.println("does not exist");

    }
    
}
