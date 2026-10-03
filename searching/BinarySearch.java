// BINARY SERACH

import java.util.*;
public class BinarySearch
{
    public static int binarysearch(int num[],int key)
    {
        int start=num[0];
        int end=num.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(num[mid]==key)
            {
                return mid;
            }
            else
            {
                if(num[mid]>key)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num[]={2,4,6,8,10,12,14};
        int key=10;
        int index=binarysearch(num,key);
        if (index==-1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println("Key is at index of "+index);
        }
    }
}
