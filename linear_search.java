import java.util.*;
public class linear_search{
    public static void main(String args[]){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i =0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int target=sc.nextInt();
        int j;
        for(j=0;j<10;j++)
        {
            if(a[j]==target)
            {
            System.out.println(j);
            break;
            }
        }
        if(j==10)
        System.out.println("does not exist");
        sc.close();
    }
}